package inputOutput.mainTask.utils;

import inputOutput.mainTask.enums.PropsName;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropsReader {

    public static final String PATH_TO_PROPERTIES = "src/main/resources/props.properties";

    FileInputStream fileInputStream;

    Properties properties = new Properties();

    public String getProperty(PropsName propsName) {

        String property = null;

        try {

            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            properties.load(fileInputStream);

            property = properties.getProperty(propsName.toString());

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error: properties file " + PATH_TO_PROPERTIES + " not found.");
            e.printStackTrace();
        }

        return property;
    }
}