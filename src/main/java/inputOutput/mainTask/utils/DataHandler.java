package inputOutput.mainTask.utils;

import inputOutput.mainTask.customExceptions.PathException;
import inputOutput.mainTask.enums.Props;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataHandler {

    private static final String FOLDER_SEPARATOR = "|-----";
    private static final String FILE_SEPARATOR = "|     ";
    private static final String END_OF_FILES_IN_FOLDER_SEPARATOR = "|";

    private PropsReader propsReader;
    private PrintStream printStream;

    public DataHandler(PropsReader propsReader, Props outputFilePath) {
        this.propsReader = propsReader;
        this.printStream = initFileSystemReader(outputFilePath);
    }

    public void writeStructureOfFoldersAndFilesToFile(Props pathToFolder)
            throws PathException {

        writeStructureOfFoldersAndFilesToFile(new File(propsReader.getProperty(pathToFolder)));
    }

    public void printNumberOfFolders(Props outputFilePath) throws PathException {

        printNumberOfFolders(new File(propsReader.getProperty(outputFilePath)),
                initScanner(new File(propsReader.getProperty(outputFilePath))));
    }

    public void printNumberOfFiles(Props outputFilePath) throws PathException {

        printNumberOfFiles(new File(propsReader.getProperty(outputFilePath)),
                initScanner(new File(propsReader.getProperty(outputFilePath))));
    }

    public void printAverageNumberOfFilesPerFolder(Props outputFilePath) throws PathException {

        printAverageNumberOfFilesPerFolder(new File(propsReader.getProperty(outputFilePath)),
                initScanner(new File(propsReader.getProperty(outputFilePath))));
    }

    public void printAverageFileNameLength(Props outputFilePath) throws PathException {

        printAverageFileNameLength(new File(propsReader.getProperty(outputFilePath)),
                initScanner(new File(propsReader.getProperty(outputFilePath))));
    }

    private PrintStream initFileSystemReader(Props props) {

        try {

            printStream = new PrintStream(new FileOutputStream(new File(propsReader.getProperty(props))));

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        return printStream;
    }

    private void writeStructureOfFoldersAndFilesToFile(File file) throws PathException {

        if (file.isDirectory()) {

            File[] tree = file.listFiles();

            if (tree != null) {

                for (int i = 0; i < tree.length; i++) {

                    if (tree[i].isDirectory()) {

                        printStream.println(FOLDER_SEPARATOR + tree[i].getName());

                        writeStructureOfFoldersAndFilesToFile(tree[i]);

                    } else {

                        printStream.println(FILE_SEPARATOR + tree[i].getName());

                        if (i == tree.length - 1) {

                            printStream.println(END_OF_FILES_IN_FOLDER_SEPARATOR);
                        }
                    }
                }
            }

        } else {

            throw new PathException("Path is incorrect, need to set correct path to directory!");
        }
    }

    private Scanner initScanner(File file) {

        Scanner scanner = null;

        try {

            scanner = new Scanner(file.toPath());

        } catch (IOException e) {

            e.printStackTrace();
        }

        return scanner;
    }

    private void printNumberOfFolders(File file, Scanner scanner) throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            int folderCounter = 0;

            while (scanner.hasNextLine()) {

                if (scanner.nextLine().startsWith(FOLDER_SEPARATOR)) {

                    folderCounter++;
                }
            }

            System.out.println("Number of folders: " + folderCounter);

        } else {

            throw new PathException("Path is incorrect, need to set correct path to txt file!");
        }
    }

    private void printNumberOfFiles(File file, Scanner scanner) throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            int fileCounter = 0;

            while (scanner.hasNextLine()) {

                if (scanner.nextLine().startsWith(FILE_SEPARATOR)) {

                    fileCounter++;
                }
            }

            System.out.println("Number of files: " + fileCounter);

        } else {

            throw new PathException("Path is incorrect, need to set correct path to txt file!");
        }
    }

    private void printAverageNumberOfFilesPerFolder(File file, Scanner scanner) throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            int folderCounter = 0;
            int fileCounter = 0;

            while (scanner.hasNextLine()) {

                String scan = scanner.nextLine();

                if (scan.startsWith(FOLDER_SEPARATOR)) {

                    folderCounter++;

                } else if (scan.startsWith(FILE_SEPARATOR)) {

                    fileCounter++;
                }
            }

            double averageNumberOfFilesPerFolder = Math.ceil((double) fileCounter / folderCounter
                    * Math.pow(10, 2)) / Math.pow(10, 2);

            System.out.println("Average number of files per folder: " + averageNumberOfFilesPerFolder);

        } else {

            throw new PathException("Path is incorrect, need to set correct path to txt file!");
        }
    }

    private void printAverageFileNameLength(File file, Scanner scanner) throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            String string;
            List<String> filesList = new ArrayList<>();
            List<Integer> fileNamesLengthsList = new ArrayList<>();

            while (scanner.hasNextLine()) {

                if ((string = scanner.nextLine()).startsWith(FILE_SEPARATOR)) {

                    filesList.add(string);

                    fileNamesLengthsList.add(string.length() - FILE_SEPARATOR.length());
                }
            }

            int lengthOfAllFiles = 0;

            for (int i = 0; i < fileNamesLengthsList.size(); i++) {

                lengthOfAllFiles += fileNamesLengthsList.get(i);
            }

            double averageFileNameLength = Math.ceil((double) lengthOfAllFiles / filesList.size()
                    * Math.pow(10, 2)) / Math.pow(10, 2);

            System.out.println("Average file name length: " + averageFileNameLength);

        } else {

            throw new PathException("Path is incorrect, need to set correct path to txt file!");
        }
    }
}