package api.utils;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

import static api.utils.Properties.*;

public class Authentications {

    public static String getAccessTokenFromProperties() {
        try {
            Properties.setProperty("token", getAccessTokenAsString());
        } catch (ParseException | SpotifyWebApiException | IOException e) {
            e.printStackTrace();
            System.out.println("Cannot set token property");
        }
        return getProperty("token");
    }

    public static String getAccessTokenAsString() throws ParseException, SpotifyWebApiException, IOException {
        final String clientId = "124994db560e4fc9821d67212382c80c";
        final String clientSecret = "3b26e3633d814400a039cb8c878f2221";

        final SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setClientId(clientId)
                .setClientSecret(clientSecret)
                .build();
        final ClientCredentialsRequest clientCredentialsRequest = spotifyApi.clientCredentials()
                .build();
        final ClientCredentials clientCredentials = clientCredentialsRequest.execute();

        return clientCredentials.getAccessToken();
    }
}
