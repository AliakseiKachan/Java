package inputOutput.mainTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Create a program that will receive the path to a directory as a command line argument, for example "D: / movies".
 * Write the structure of folders and files to a text file in a form similar to the execution of the tree / F program.
 * Example:
 *
 * Amon amarth
 *  |-----2004 - Fate Of Norns
 *  |     01 - An Ancient Sign Of Coming Storm.mp3
 *  |     02 - Where Death Seems To Dwell.mp3
 *  |     03 - The Fate Of Norns.mp3
 *  |     04 - The Pursuit Of Vikings.mp3
 *  |     05 - Valkyries Ride.mp3
 *  |     06 - The Beheading Of A King.mp3
 *  |     07 - Arson.mp3
 *  |     08 - Once Sealed In Blood.mp3
 *  |
 *  |-----2016 - Jomsviking
 *  |     01 First Kill.mp3
 *  |     02 Wanderer.mp3
 *  |     03 On A Sea Of Blood.mp3
 *  |     04 One Against All.mp3
 *  |     05 Raise Your Horns.mp3
 *  |     06 The Way Of Vikings.mp3
 *  |     07 At Dawn's First Light.mp3
 *  |     08 One Thousand Burning Arrows.mp3
 *  |     09 Vengeance Is My Name.mp3
 *  |     10 A Dream That Cannot Be (feat. Doro Pesch) .mp3
 *  |     11 Back On Northern Shores.mp3
 *  |     12 Death In Fire 2016.mp3
 *  |     13 Death In Fire (Live) .mp3
 *  |
 *  |-----2019 - Berserker
 *        01 Fafner's Gold.mp3
 *        02 Crack the Sky.mp3
 *        03 Mjölner, Hammer of Thor.mp3
 *        04 Shield Wall.mp3
 *        05 Valkyria.mp3
 *        06 Raven's Flight.mp3
 *        07 Ironside.mp3
 *        08 The Berserker at Stamford Bridge.mp3
 *        09 When Once Again We Can Set Our Sails.mp3
 *        10 Skoll and Hati.mp3
 *        11 Wings of Eagles.mp3
 *        12 Into the Dark.mp3
 *
 * If, as a parameter, not the path to the directory is passed to the program, but the path to the txt file according
 * to the example above, read the file and output the following data to the console:
 *
 *     Number of folders
 *     Number of files
 *     Average number of files per folder
 *     Average file name length
 *
 * This is path to folder, to use as command line argument: "C:\Java\src\main\resources\IOmainTask"
 * This is path to file, to use as command line argument: "C:\Java\src\main\resources\outIOTask.txt"
 */

public class Main {

    public static void main(String[] args) throws PathException {

        getTree(new File(args[0]));
        readFile(new File(args[1]));
    }

    public static void getTree(File file) throws PathException {

        if (file.isDirectory()) {

            File outputIOTask = new File("C:/Java/src/main/resources/outIOTask.txt");

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

    public static void readFile(File file) throws PathException {

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