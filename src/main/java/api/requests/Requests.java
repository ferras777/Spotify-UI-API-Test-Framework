package api.requests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Requests {

    public static Response searchForTracks(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {

        return given()
                .spec(requestSpecification)
                .param("q", "bohemian")
                .param("type", "track")
                .param("limit", 1)
                .param("market", "RU").
        when()
                .get().
        then().
                spec(responseSpecification).
                assertThat().statusCode(200).
                        extract().response();
    }

    public static void schemaValidation(RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {
        given()
                .spec(requestSpecification)
                .param("q", "bohemian")
                .param("type", "track")
                .param("limit", 1)
                .param("market", "RU").
                        when()
                .get().
                        then().
                        spec(responseSpecification).
                        assertThat().statusCode(200).
                        assertThat().body(matchesJsonSchemaInClasspath("SearchTrackSchema.json"));
    }

    public static Response getAnArtist(String id,RequestSpecification requestSpecification, ResponseSpecification responseSpecification) {

        return given()
                .spec(requestSpecification)
            .when()
                .get(id)
            .then()
                .spec(responseSpecification)
                .assertThat().statusCode(200)
                .extract().response();
    }
}
