package api.asserts;

import api.bodies.artist.ArtistBody;
import api.bodies.error.ErrorBody;
import api.bodies.json.JsonData;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class ArtistApiAssertions {

    @Step
    public static void checkResponseRightArtistName(ArtistBody artistBody, JsonData jsonData) {
        assertEquals(artistBody.getName(), jsonData.getName(), "Wrong name of artist");
    }

    @Step
    public static void checkResponseRightArtistId(ArtistBody artistBody, JsonData jsonData) {
        assertEquals(artistBody.getId(), jsonData.getId(), "Wrong id of artist");
    }

    @Step
    public static void checkResponseBodyErrorMessage(Response response) {
        ErrorBody errorBody = response.getBody().as(ErrorBody.class);

        assertEquals(errorBody.getError().getMessage(), "invalid id", "Wrong message");
    }
}
