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
    private File file;
    private PrintStream printStream;

    public DataHandler(PropsReader propsReader, Props outputFilePath) {

        this.propsReader = propsReader;
        this.file = new File(propsReader.getProperty(outputFilePath));
        this.printStream = initFileSystemReader();
    }

    public void writeStructureOfFoldersAndFilesToFile(Props pathToFolder) throws PathException {

        writeStructureOfFoldersAndFilesToFile(new File(propsReader.getProperty(pathToFolder)));
    }

    private PrintStream initFileSystemReader() {

        try {

            printStream = new PrintStream(new FileOutputStream(file));

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

    public void printNumberOfFolders() throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            Scanner scanner = null;

            try {

                scanner = new Scanner(file.toPath());

            } catch (IOException e) {

                e.printStackTrace();
            }

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

    public void printNumberOfFiles() throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            Scanner scanner = null;

            try {

                scanner = new Scanner(file.toPath());

            } catch (IOException e) {

                e.printStackTrace();
            }

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

    public void printAverageNumberOfFilesPerFolder() throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            Scanner scanner = null;

            try {

                scanner = new Scanner(file.toPath());

            } catch (IOException e) {

                e.printStackTrace();
            }

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

    public void printAverageFileNameLength() throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            Scanner scanner = null;

            try {

                scanner = new Scanner(file.toPath());

            } catch (IOException e) {

                e.printStackTrace();
            }

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