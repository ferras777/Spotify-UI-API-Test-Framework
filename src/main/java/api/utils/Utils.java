package api.utils;

import api.bodies.track.TrackBody;
import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import io.restassured.response.Response;
import org.apache.hc.core5.http.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.when;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Utils {

    public static void getAccessTokenAsProperty() throws ParseException, SpotifyWebApiException, IOException {
        Properties property = new Properties();

        final String clientId = "124994db560e4fc9821d67212382c80c";
        final String clientSecret = "3b26e3633d814400a039cb8c878f2221";

        final SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setClientId(clientId)
                .setClientSecret(clientSecret)
                .build();
        final ClientCredentialsRequest clientCredentialsRequest = spotifyApi.clientCredentials()
                .build();
        final ClientCredentials clientCredentials = clientCredentialsRequest.execute();

        property.setProperty("token", clientCredentials.getAccessToken());

        try (FileWriter output = new FileWriter("src/main/resources/config.properties")) {
            property.store(output, "These are properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String propertyName) {
        Properties properties = new Properties();

        try (FileReader fileReader = new FileReader("src/main/resources/config.properties")) {
            getAccessTokenAsProperty();
            properties.load(fileReader);
        } catch (IOException | ParseException | SpotifyWebApiException e) {
            e.printStackTrace();
        }
        return properties.getProperty(propertyName);
    }

    public static void schemaValidation(Response response, String nameOfSchema) {
        response.
                then().
                assertThat().
                body(matchesJsonSchemaInClasspath(nameOfSchema));
    }

    public static String getContentTypeofDownloadFile(TrackBody trackBody) {
        return when().get(trackBody.getPreview_url()).then().extract().contentType();
    }
}
