package api.requests;

import api.bodies.artist.ArtistBody;
import api.specifications.Specifications;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ArtistRequests {
    Specifications specifications = new Specifications();

    public ArtistBody getArtistBody(String id) {
        return getAnArtist(id).as(ArtistBody.class);
    }

    public Response getAnArtist(String id) {

        //TODO rewrite in bdd style
        return given()
                    .spec(specifications.requestSpecification.header("", ""))
                .when()
                    .get("/artists/{id}" + id)
                .then()
                    .spec(specifications.responseSpecification)
                    .assertThat().statusCode(200)
                    .extract().response();
    }
}
