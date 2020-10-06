package api.requests;

import api.specifications.Specifications;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ArtistRequests {
    Specifications specifications = new Specifications();

    public Response getAnArtist(String id) {

        //TODO rewrite in bdd style
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
