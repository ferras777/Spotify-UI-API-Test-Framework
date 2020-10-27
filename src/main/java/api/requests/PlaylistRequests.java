package api.requests;
import api.bodies.playlist.PlaylistPageBody;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static api.enums.Endpoints.CREATE_PLAYLIST;
import static api.enums.Endpoints.GET_LIST_OF_USER_PLAYLISTS;
import static api.specifications.ResponseSpecifications.responseSpecification;
import static api.specifications.SpecificUserSpecification.requestSpecificationWithSpecificUser;
import static api.utils.Properties.getProperty;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;

public class PlaylistRequests {

    public PlaylistPageBody getUserPlaylistsPageBody() {
        Gson gson = new GsonBuilder().
                excludeFieldsWithoutExposeAnnotation().
                create();
        return gson.fromJson(getListOfUserPlaylists().getBody().asString(), PlaylistPageBody.class);
    }

    //todo make class for body (create bodyConstructor body, default bodies)
    public void createPlaylist(String nameOfPlaylist) {
         given()
                    .spec(requestSpecificationWithSpecificUser)
                    .config(RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig()
                            .encodeContentTypeAs("*/*", ContentType.TEXT)))
                    .body("{ \"name\": \""+ nameOfPlaylist + "\", \"description\":" +
                            " \"New playlist description\", \"public\": " +
                            "false }")
                .when()
                    .post(CREATE_PLAYLIST.getPath(), getProperty("userID"))
                .then()
                    .spec(responseSpecification)
                    .assertThat().statusCode(SC_CREATED);
    }

    public Response getListOfUserPlaylists() {
        return given()
                    .spec(requestSpecificationWithSpecificUser)
                .when()
                    .get(GET_LIST_OF_USER_PLAYLISTS.getPath())
                .then()
                    .spec(responseSpecification)
                    .assertThat().statusCode(SC_OK)
                    .extract().response();
    }
}
