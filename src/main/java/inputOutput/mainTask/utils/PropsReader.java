package inputOutput.mainTask.utils;

import inputOutput.mainTask.enums.Props;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropsReader {

    private static final String PATH_TO_PROPERTIES = "src/main/resources/props.properties";

    private final Properties properties = new Properties();

    public String getProperty(Props props) {

        String property = null;

        try {

            FileInputStream fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            properties.load(fileInputStream);

            property = properties.getProperty(props.toString());

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            System.out.println("Error: properties file " + PATH_TO_PROPERTIES + " not found.");
            e.printStackTrace();
        }

        return property;
    }
}