package api.requests;

import io.restassured.response.Response;

import static api.specifications.RequestSpecifications.requestSpecification;
import static api.specifications.ResponseSpecifications.responseSpecification;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class SearchTracksRequests {
    public Response searchForTracks(String searchString) {
        return given().
                    spec(requestSpecification).
                    param("q", searchString).
                    param("type", "track").
                    param("limit", 1).
                    param("market", "RU").
                when().
                    get("/search").
                then().
                    spec(responseSpecification).
                    assertThat().statusCode(SC_OK).
                    extract().response();
    }
}
