package api.utils;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

import static api.utils.Properties.*;

public class Authentications {

    public static String getAccessTokenAsString() {
        final SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setClientId(getProperty("clientID"))
                .setClientSecret(getProperty("clientSecret"))
                .build();

        final ClientCredentialsRequest clientCredentialsRequest = spotifyApi.clientCredentials()
                .build();
        ClientCredentials clientCredentials = null;

        try {
            clientCredentials = clientCredentialsRequest.execute();
        } catch (IOException | SpotifyWebApiException | ParseException e) {
            e.printStackTrace();
        }
        if (clientCredentials != null) {
            return clientCredentials.getAccessToken();
        } else {
            return null;
        }
    }
}
