package seleniumClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/droppable");

        Actions ac = new Actions(driver);

        ac.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable")))
                .perform();
        Thread.sleep(3000);

        ac
                .contextClick(driver.findElement(By.cssSelector(".text-center")))
                .perform();
        Thread.sleep(3000);

        driver.findElement(By.tagName("body")).click();
        Thread.sleep(3000);

        driver.quit();
    }
}
