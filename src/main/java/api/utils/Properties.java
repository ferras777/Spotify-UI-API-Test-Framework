package api.utils;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Properties {

    public static String getProperty(String propertyName) {
        java.util.Properties properties = new java.util.Properties();
        try (FileReader fileReader = new FileReader("src/main/resources/config.properties")) {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }

    public static void setProperty(String key, String value) {
        java.util.Properties property = new java.util.Properties();
        property.setProperty(key, value);
        try (FileWriter output = new FileWriter("src/main/resources/config.properties")) {
            property.store(output, "These are properties");
        } catch (IOException e) {
            System.out.println("Cannot create property");
        }
    }
}
