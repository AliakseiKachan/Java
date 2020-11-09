package inputOutput.mainTask.utils;

import inputOutput.mainTask.customExceptions.PathException;
import inputOutput.mainTask.enums.PropsName;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilsReader {

    PropsReader propsReader = new PropsReader();

    public void getTree(File file) throws PathException {

        if (file.isDirectory()) {

            File outputIOTask = new File(propsReader.getProperty(PropsName.PATH_TO_FILE));

            if (outputIOTask.exists() && outputIOTask.isFile()) {

                outputIOTask.delete();
            }

            try (PrintStream printStream = new PrintStream(new FileOutputStream(outputIOTask, true))) {

                File[] tree = file.listFiles();

                if (tree != null) {

                    for (int i = 0; i < tree.length; i++) {

                        if (tree[i].isDirectory()) {

                            printStream.println("|-----" + tree[i].getName());

                            getTree(tree[i]);

                        } else {

                            printStream.println("|     " + tree[i].getName());

                            if (i == tree.length - 1) {

                                printStream.println("|");
                            }
                        }
                    }
                }

            } catch (FileNotFoundException e) {

                e.printStackTrace();
            }

        } else throw new PathException("Path is incorrect, need to set correct path to directory!");
    }

    public void readFile(File file) throws PathException {

        if (file.isFile() && file.getAbsolutePath().endsWith(".txt")) {

            Scanner scanner = null;

            try {

                scanner = new Scanner(file.toPath());

            } catch (IOException e) {

                e.printStackTrace();
            }

            int folderCounter = 0;

            while (scanner.hasNextLine()) {

                if (scanner.nextLine().startsWith("|-----")) {

                    folderCounter++;
                }
            }

            scanner.close();

            try {

                scanner = new Scanner(file.toPath());

            } catch (IOException e) {

                e.printStackTrace();
            }

            int fileCounter = 0;

            while (scanner.hasNextLine()) {

                if (scanner.nextLine().startsWith("|     ")) {
                    fileCounter++;
                }
            }

            scanner.close();

            try {

                scanner = new Scanner(file.toPath());

            } catch (IOException e) {

                e.printStackTrace();
            }

            String string;
            List<String> filesList = new ArrayList<>();
            List<Integer> fileNamesLengthsList = new ArrayList<>();

            while (scanner.hasNextLine()) {

                if ((string = scanner.nextLine()).startsWith("|     ")) {

                    filesList.add(string);

                    fileNamesLengthsList.add(string.length() - 6);

                }
            }

            int sum = 0;

            for (int i = 0; i < fileNamesLengthsList.size(); i++) {

                sum += fileNamesLengthsList.get(i);
            }

            System.out.println("The count of folders: " + folderCounter);

            System.out.println("The count of files: " + fileCounter);

            System.out.println("Average count of files in folder: "
                    + Math.ceil((double) fileCounter / folderCounter * Math.pow(10, 2)) / Math.pow(10, 2));

            System.out.println("The average length of file name is: "
                    + Math.ceil((double) sum / fileCounter * Math.pow(10, 2)) / Math.pow(10, 2));

        } else throw new PathException("Path is incorrect, need to set correct path to txt file!");
    }
}