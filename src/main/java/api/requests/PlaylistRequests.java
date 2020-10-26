package api.requests;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static api.specifications.RequestSpecifications.requestSpecificationWithSpecificUser;
import static api.specifications.ResponseSpecifications.responseSpecification;
import static api.utils.Properties.getProperty;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;

public class PlaylistRequests {

    public Response createAPlaylist(String nameOfPlaylist) {
        return given()
                    .spec(requestSpecificationWithSpecificUser)
                    .config(RestAssuredConfig.config().encoderConfig(EncoderConfig.encoderConfig()
                            .encodeContentTypeAs("*/*", ContentType.TEXT)))
                    .body("{ \"name\": \""+ nameOfPlaylist + "\", \"description\":" +
                            " \"New playlist description\", \"public\": " +
                            "false }")
                .when()
                    .post("/users/{user_id}/playlists", getProperty("userID"))
                .then()
                    .spec(responseSpecification)
                    .assertThat().statusCode(SC_CREATED)
                    .extract().response();
    }

    public Response getListOfUserPlaylists() {
        return given()
                    .spec(requestSpecificationWithSpecificUser)
                .when()
                    .get("/me/playlists")
                .then()
                    .spec(responseSpecification)
                    .assertThat().statusCode(SC_OK)
                    .extract().response();
    }
}
