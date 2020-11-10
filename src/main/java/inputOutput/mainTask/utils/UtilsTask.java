package inputOutput.mainTask.utils;

import inputOutput.mainTask.customExceptions.PathException;
import inputOutput.mainTask.enums.PropsName;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilsTask {

    private static final String FOLDER_SEPARATOR = "|-----";
    private static final String FILE_SEPARATOR = "|     ";
    private static final String END_OF_FILES_IN_FOLDER_SEPARATOR = "|";

    public PrintStream initFileSystemReader(PropsReader propsReader, PropsName propsName) {

        PrintStream printStream = null;

        try {

            printStream = new PrintStream(new FileOutputStream(new File(propsReader.getProperty(propsName))));

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        return printStream;
    }

    public void getTree(File file, PrintStream printStream) throws PathException {

        if (file.isDirectory()) {

            File[] tree = file.listFiles();

            if (tree != null) {

                for (int i = 0; i < tree.length; i++) {

                    if (tree[i].isDirectory()) {

                        printStream.println(FOLDER_SEPARATOR + tree[i].getName());

                        getTree(tree[i], printStream);

                    } else {

                        printStream.println(FILE_SEPARATOR + tree[i].getName());

                        if (i == tree.length - 1) {

                            printStream.println(END_OF_FILES_IN_FOLDER_SEPARATOR);
                        }
                    }
                }
            }

        } else throw new PathException("Path is incorrect, need to set correct path to directory!");
    }

    public Scanner initScanner(File file) {

        Scanner scanner = null;

        try {

            scanner = new Scanner(file.toPath());

        } catch (IOException e) {

            e.printStackTrace();
        }

        return scanner;
    }

    public int getNumberOfFolders(File file, Scanner scanner) throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            int folderCounter = 0;

            while (scanner.hasNextLine()) {

                if (scanner.nextLine().startsWith(FOLDER_SEPARATOR)) {

                    folderCounter++;
                }
            }

            return folderCounter;

        } else throw new PathException("Path is incorrect, need to set correct path to txt file!");
    }

    public int getNumberOfFiles(File file, Scanner scanner) throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            int fileCounter = 0;

            while (scanner.hasNextLine()) {

                if (scanner.nextLine().startsWith(FILE_SEPARATOR)) {

                    fileCounter++;
                }
            }

            return fileCounter;

        } else throw new PathException("Path is incorrect, need to set correct path to txt file!");
    }

    public double getAverageFileNameLength(File file, Scanner scanner) throws PathException {

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

            return averageFileNameLength;

        } else throw new PathException("Path is incorrect, need to set correct path to txt file!");
    }
}