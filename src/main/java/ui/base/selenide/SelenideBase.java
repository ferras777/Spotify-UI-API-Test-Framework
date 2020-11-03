package ui.base.selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public abstract class SelenideBase {
    protected WebDriver driver;
    protected ChromeOptions options;

    @BeforeSuite
    public void beforeClass() {
        chromedriver().setup();

    }

    @BeforeMethod
    public void beforeMethod() {
        options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        WebDriverRunner.setWebDriver(driver);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
