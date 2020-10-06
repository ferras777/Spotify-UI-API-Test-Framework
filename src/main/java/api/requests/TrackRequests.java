package api.requests;

import api.specifications.Specifications;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TrackRequests {
    Specifications specifications = new Specifications();

    public Response getTrack(String id) {

        return given()
                .spec(specifications.requestSpecification)
                .when()
                .get("/tracks/" + id)
                .then()
                .spec(specifications.responseSpecification)
                .assertThat().statusCode(200)
                .extract().response();
    }
}
