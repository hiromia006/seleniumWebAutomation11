package class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class NavigateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().to("https://parabank.parasoft.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.quit();

    }
}
