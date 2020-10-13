package api.requests;

import api.bodies.artist.ArtistBody;
import io.restassured.response.Response;

import static api.specifications.RequestSpecifications.requestSpecification;
import static api.specifications.ResponseSpecifications.responseSpecification;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class ArtistRequests {

    public ArtistBody getArtistBody(String id) {
        return getAnArtist(id).as(ArtistBody.class);
    }

    //todo gherkin style
    public Response getAnArtist(String id) {
        return given()
                    .spec(requestSpecification)
                .when()
                    .get("/artists/" + id)
                .then()
                    .spec(responseSpecification)
                    .assertThat().statusCode(SC_OK)
                .extract().response();
    }
}
