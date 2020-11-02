package api.asserts;

import api.bodies.json.JsonData;
import api.bodies.track.TrackBody;
import io.qameta.allure.Step;

import static org.testng.Assert.assertEquals;

public class TrackApiAssertions {

    @Step
    public static void checkResponseRightTrackName(TrackBody trackBody, JsonData jsonData) {
        assertEquals(trackBody.getName(), jsonData.getName(), "Wrong name of track");
    }

    @Step
    public static void checkResponseRightTrackId(TrackBody trackBody, JsonData jsonData) {
        assertEquals(trackBody.getId(), jsonData.getId(), "Wrong id of track");
    }
}
