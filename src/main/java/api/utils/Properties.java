package api.utils;
import java.io.FileReader;
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

    public static String getRefreshToken() {
        java.util.Properties properties = new java.util.Properties();
        try (FileReader fileReader = new FileReader("src/main/resources/spotify_tokens.properties")) {
            properties.load(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("refreshToken");
    }
}
