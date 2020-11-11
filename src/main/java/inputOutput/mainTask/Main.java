package inputOutput.mainTask;

import inputOutput.mainTask.customExceptions.PathException;
import inputOutput.mainTask.enums.Props;
import inputOutput.mainTask.utils.PropsReader;
import inputOutput.mainTask.utils.DataHandler;

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
 */

public class Main {

    public static void main(String[] args) throws PathException {

        PropsReader propsReader = new PropsReader();
        DataHandler dataHandler = new DataHandler(propsReader, Props.PATH_TO_OUTPUT_FILE);

        dataHandler.writeStructureOfFoldersAndFilesToFile(Props.PATH_TO_FOLDER);
        dataHandler.printNumberOfFolders(Props.PATH_TO_OUTPUT_FILE);
        dataHandler.printNumberOfFiles(Props.PATH_TO_OUTPUT_FILE);
        dataHandler.printAverageNumberOfFilesPerFolder(Props.PATH_TO_OUTPUT_FILE);
        dataHandler.printAverageFileNameLength(Props.PATH_TO_OUTPUT_FILE);
    }
}