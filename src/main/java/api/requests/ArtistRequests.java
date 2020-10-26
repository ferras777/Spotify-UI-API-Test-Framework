package api.requests;

import api.bodies.artist.ArtistBody;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import static api.specifications.RequestSpecifications.requestSpecification;
import static api.specifications.ResponseSpecifications.responseSpecification;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class ArtistRequests {

    public ArtistBody getArtistBody(String id) {
        return getAnArtist(id).as(ArtistBody.class);
    }

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

    public Response getAnArtistWithWrongId() {
        return given()
                    .spec(requestSpecification)
                .when()
                    .get("/artists/asd64as6d5a46s5d4z23xc145")
                .then()
                    .spec(responseSpecification)
                    .assertThat().statusCode(HttpStatus.SC_BAD_REQUEST)
                    .extract().response();
    }
}
