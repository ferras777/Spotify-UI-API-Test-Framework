package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArtistPage {

    public String getArtistTitle(WebDriver driver) {
        return driver.findElements(By.cssSelector("h1")).get(1).getText();
    }
}
