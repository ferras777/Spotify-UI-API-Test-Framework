package api.utils;

import com.wrapper.spotify.SpotifyApi;
import com.wrapper.spotify.SpotifyHttpManager;
import com.wrapper.spotify.exceptions.SpotifyWebApiException;
import com.wrapper.spotify.model_objects.credentials.AuthorizationCodeCredentials;
import com.wrapper.spotify.model_objects.credentials.ClientCredentials;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRefreshRequest;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRequest;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeUriRequest;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import org.apache.hc.core5.http.ParseException;

import java.io.IOException;

import static api.utils.Properties.getProperty;

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

    // TODO: authentication with specific user
    public static String getSpecificUserRefreshToken() {
        final String code = "AQBMs0AKrBuF45eqtJBHoSY5cU_ksNzw8VFjtpC3LXZfMOwd5iwtuo2BV3OiLTjAI_v_TRxb96o7sefmjvWLA5UXnwQhYJKVAl5O6pXM7874hDTLPxCt72St19QkBBg5qDNEJCT0u9TDp6XDoqaJLsqp6BqFKD4m3qwErb_AR-wj6j2EF88krTZLq5fhbf4MGtKbKhqlhTJH854r2RqR1bx4Ofl0j037WETLAMwq7uo";

        final SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setClientId(getProperty("clientID"))
                .setClientSecret(getProperty("clientSecret"))
                .setRedirectUri(SpotifyHttpManager.makeUri("http://mysite.com/callback/"))
                .build();
        final AuthorizationCodeUriRequest authorizationCodeUriRequest = spotifyApi.authorizationCodeUri()
                .scope("playlist-modify-public, playlist-modify-private")
                .show_dialog(false).build();
        System.out.println(authorizationCodeUriRequest.getUri().toString());

        final AuthorizationCodeRequest authorizationCodeRequest = spotifyApi.authorizationCode(code)
                .build();

            try {
                final AuthorizationCodeCredentials authorizationCodeCredentials = authorizationCodeRequest.execute();

                System.out.println("Expires in: " + authorizationCodeCredentials.getExpiresIn());
                return authorizationCodeCredentials.getRefreshToken();
            } catch (IOException | SpotifyWebApiException | ParseException e) {
                System.out.println("Error: " + e.getMessage());
                return null;
            }
    }

    public static String getAccessTokenWithRefreshToken() {
        String refreshToken = getSpecificUserRefreshToken();

        final SpotifyApi spotifyApi = new SpotifyApi.Builder()
                .setClientId(getProperty("clientID"))
                .setClientSecret(getProperty("clientSecret"))
                .setRefreshToken(refreshToken)
                .build();
        final AuthorizationCodeRefreshRequest authorizationCodeRefreshRequest = spotifyApi.authorizationCodeRefresh()
                .build();

        try {
            final AuthorizationCodeCredentials authorizationCodeCredentials = authorizationCodeRefreshRequest.execute();

            System.out.println("Expires in: " + authorizationCodeCredentials.getExpiresIn());

            return authorizationCodeCredentials.getAccessToken();
        } catch (IOException | SpotifyWebApiException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
