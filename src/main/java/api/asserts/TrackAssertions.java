package api.asserts;

import api.bodies.json.JsonData;
import api.bodies.track.TrackBody;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TrackAssertions {

    public static void checkResponseRightTrackName(TrackBody trackBody, JsonData jsonData) {
        assertEquals(trackBody.getName(), jsonData.getName(), "Wrong name of track");
    }

    public static void checkResponseRightTrackId(TrackBody trackBody, JsonData jsonData) {
        assertEquals(trackBody.getId(), jsonData.getId(), "Wrong id of id");
    }

    public static void checkUIPageContainsNameOfTrack(WebDriver driver, TrackBody trackBody) {
        boolean isContains = false;

        driver.get(trackBody.getExternal_urls().getSpotify());
        List<WebElement> listOfTracks = driver.findElements(By.cssSelector("[data-testid=\"tracklist-row\"]"));

        for (WebElement webElement: listOfTracks) {
            if (webElement.getText().contains(trackBody.getName())) {
                isContains = true;
                break;
            }
        }
        assertTrue(isContains);
    }
}
