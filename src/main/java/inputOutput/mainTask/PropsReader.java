package inputOutput.mainTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropsReader {

    public static final String PATH_TO_PROPERTIES = "src/main/resources/props.properties";

    FileInputStream fileInputStream;

    Properties properties = new Properties();

    public String getPathToFolder() {

        String pathToFolder = null;

        try {

            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            properties.load(fileInputStream);

            pathToFolder = properties.getProperty("pathToFolder");

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error: properties file " + PATH_TO_PROPERTIES + " not found.");
            e.printStackTrace();
        }

        return pathToFolder;
    }

    public String getPathToFile() {

        String pathToFile = null;

        try {

            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            properties.load(fileInputStream);

            pathToFile = properties.getProperty("pathToFile");

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error: properties file " + PATH_TO_PROPERTIES + " not found.");
            e.printStackTrace();
        }

        return pathToFile;
    }
}