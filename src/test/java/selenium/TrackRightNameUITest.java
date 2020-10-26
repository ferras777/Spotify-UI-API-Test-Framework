package selenium;
import api.bodies.json.JsonData;
import api.requests.TrackRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.base.SeleniumBase;

import java.io.FileNotFoundException;

import static api.asserts.TrackAssertions.checkUIPageContainsNameOfTrack;
import static api.utils.Json.getTracksDataFromJson;

public class TrackRightNameUITest extends SeleniumBase {
    TrackRequests trackRequests = new TrackRequests();

    @DataProvider
    public Object[][] tracks() throws FileNotFoundException {
        return getTracksDataFromJson(1);
    }


    @Test(description="Track right name test", dataProvider = "tracks")
    public void trackRightNameTest(JsonData jsonData) {

        checkUIPageContainsNameOfTrack(driver, trackRequests.getTrackBody(jsonData.getId()));
    }
}
