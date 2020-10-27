package api.requests;

import api.bodies.track.TrackBody;
import io.restassured.response.Response;

import static api.enums.Endpoints.GET_TRACK;
import static api.specifications.RequestSpecifications.requestSpecification;
import static api.specifications.ResponseSpecifications.responseSpecification;
import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_OK;

public class TrackRequests {

    public TrackBody getTrackBody(String id) {
        return getTrack(id).as(TrackBody.class);
    }

    public Response getTrack(String id) {
        return given()
                    .spec(requestSpecification)
                .when()
                    .get(GET_TRACK + id)
                .then()
                    .spec(responseSpecification)
                    .assertThat().statusCode(SC_OK)
                .extract().response();
    }
}
