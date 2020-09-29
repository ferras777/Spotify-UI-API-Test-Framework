package api.requests;

import api.specifications.Specifications;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Requests {

    Specifications specifications = new Specifications();

    public Response searchForTracks(String searchString) {

        return given()
                .spec(specifications.requestSpecification)
                .param("q", searchString)
                .param("type", "track")
                .param("limit", 1)
                .param("market", "RU").
        when()
                .get("/search").
        then().
                spec(specifications.responseSpecification).
                assertThat().statusCode(200).
                        extract().response();
    }

    public void searchTrackSchemaValidation(String nameOfSchema) {
        given()
                .spec(specifications.requestSpecification)
                .param("q", "bohemian")
                .param("type", "track")
                .param("limit", 1)
                .param("market", "RU").
        when()
                .get("/search").
        then().
                spec(specifications.responseSpecification).
                assertThat().statusCode(200).
                assertThat().body(matchesJsonSchemaInClasspath(nameOfSchema));
    }

    public Response getAnArtist(String id) {

        return given()
                .spec(specifications.requestSpecification)
            .when()
                .get("/artists/" + id)
            .then()
                .spec(specifications.responseSpecification)
                .assertThat().statusCode(200)
                .extract().response();
    }
}
