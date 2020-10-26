package api;

import api.bodies.json.JsonData;
import api.requests.TrackRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static api.asserts.TrackAssertions.checkResponseRightTrackId;
import static api.asserts.TrackAssertions.checkResponseRightTrackName;
import static api.utils.Json.getTracksDataFromJson;

public class TrackTests {

    TrackRequests trackRequests = new TrackRequests();

    @DataProvider(parallel = true)
    public Object[][] tracks() throws FileNotFoundException {
        return getTracksDataFromJson();
    }
    
    @Test(description="Check right name of track", dataProvider = "tracks")
    public void checkRightNameOfTrack(JsonData jsonData) {
        checkResponseRightTrackName(trackRequests.getTrackBody(jsonData.getId()), jsonData);
    }

    @Test(description="Check right id of track", dataProvider = "tracks")
    public void checkRightIdOfTrack(JsonData jsonData) {
        checkResponseRightTrackId(trackRequests.getTrackBody(jsonData.getId()), jsonData);
    }
}
