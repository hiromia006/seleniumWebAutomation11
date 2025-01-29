package seleniumClass3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        //confirmation alert
        Thread.sleep(2000);
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();


        Thread.sleep(2000);
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);

//        driver.switchTo().alert().sendKeys("skdksaldnlas");
//        Thread.sleep(2000);
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().accept();
//
        Alert alt=driver.switchTo().alert();
        alt.sendKeys("sadsadk ");
        Thread.sleep(2000);
        System.out.println(alt.getText());
        Thread.sleep(2000);
        alt.accept();


        driver.quit();
    }
}
