package selenium;

import api.bodies.json.JsonData;
import api.requests.TrackRequests;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.base.selenium.SeleniumBase;

import java.io.FileNotFoundException;

import static api.utils.Json.getTracksDataFromJson;
import static ui.asserts.TrackUIAssertions.checkUIPageContainsNameOfTrack;

public class TrackRightNameUITest extends SeleniumBase {
    TrackRequests trackRequests = new TrackRequests();

    @DataProvider
    public Object[][] tracks() throws FileNotFoundException {
        return getTracksDataFromJson(1);
    }

    @Epic(value = "Треки")
    @Feature(value = "Проверка треков через UI")
    @Story(value = "Проверка имени трека")
    @Test(description = "Track right name test", dataProvider = "tracks")
    public void trackRightNameTest(JsonData jsonData) {
        checkUIPageContainsNameOfTrack(driver, trackRequests.getTrackBody(jsonData.getId()));
    }
}
