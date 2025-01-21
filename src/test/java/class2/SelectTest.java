package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        Select sl=new Select(driver.findElement(By.cssSelector("select[name='country']")));
        sl.selectByIndex(2);
        Thread.sleep(3000);

        sl.selectByValue("ANDORRA");
        Thread.sleep(5000);

        sl.selectByVisibleText("ALBANIA");
        Thread.sleep(3000);

        driver.quit();
    }
}
