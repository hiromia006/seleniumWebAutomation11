package testngClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseSauceDemoClassTest {
    protected WebDriver driver;

    @BeforeClass
    public void browserSetup() {
        if (driver == null) { // Ensure driver is initialized
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }
    }

    @AfterClass
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null; // Reset to avoid stale WebDriver
        }
    }
}
