package ui.pages.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArtistPage {

    public String getArtistTitle(WebDriver driver) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 5000);
        webDriverWait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("h1"), 2));
        return driver.findElements(By.cssSelector("h1")).get(1).getText();
    }
}
