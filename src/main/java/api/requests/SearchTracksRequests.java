package api.requests;

import api.specifications.Specifications;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SearchTracksRequests {

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
}
