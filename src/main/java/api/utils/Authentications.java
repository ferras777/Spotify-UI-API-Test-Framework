package api.utils;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.AuthorizationCodeCredentials;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRefreshRequest;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

import static api.utils.Properties.getProperty;
import static api.utils.Properties.getRefreshToken;

public class Authentications {

    public static String getAccessTokenNonSpecificUserAsString() {

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

    public static String getAccessTokenWithRefreshToken() {
        final SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setClientId(getProperty("clientID"))
                .setClientSecret(getProperty("clientSecret"))
                .setRefreshToken(getRefreshToken())
                .build();

        final AuthorizationCodeRefreshRequest authorizationCodeRefreshRequest = spotifyApi.authorizationCodeRefresh()
                .build();

        try {
            final AuthorizationCodeCredentials authorizationCodeCredentials = authorizationCodeRefreshRequest.execute();
            return authorizationCodeCredentials.getAccessToken();
        } catch (IOException | SpotifyWebApiException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
