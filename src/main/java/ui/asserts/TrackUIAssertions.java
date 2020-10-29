package ui.asserts;

import api.bodies.track.TrackBody;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class TrackUIAssertions {

    public static void checkUIPageContainsNameOfTrack(WebDriver driver, TrackBody trackBody) {
        boolean isContains = false;
        driver.get(trackBody.getExternal_urls().getSpotify());
        List<WebElement> listOfTracks = driver.findElements(By.cssSelector("[data-testid=\"tracklist-row\"]"));
        for (WebElement webElement : listOfTracks) {
            if (webElement.getText().contains(trackBody.getName())) {
                isContains = true;
                break;
            }
        }
        assertTrue(isContains, "Track not exists on page");
    }
}
