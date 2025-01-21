package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class SelectorsTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://parabank.parasoft.com/");

        System.out.println(driver.getTitle());

       String txt= driver.findElement(By.className("caption")).getText().trim();
        System.out.println(txt);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("in in")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("adsadsa");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("asa");
        Thread.sleep(2000);

        List<WebElement> list= driver.findElements(By.tagName("a"));
        for (WebElement element:list){
            System.out.println(element.getText());
            System.out.println(element.getDomAttribute("href"));
        }


        driver.quit();

    }
}
