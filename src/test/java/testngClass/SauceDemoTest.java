package testngClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTest {

    @Test
    public void login1() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("#login-button")).click();


        String ti = driver.findElement(By.cssSelector(".title")).getText().trim();
        Assert.assertEquals(ti, "Products");
        driver.quit();
    }

    @Test
    public void loginFailWithoutUsername() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#login-button")).click();

        Assert.assertTrue(driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0);
        driver.quit();
    }

    @Test
    public void loginFailWithoutUsernameAndPassword() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#login-button")).click();

        Assert.assertTrue(driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0);
        driver.quit();
    }

    @Test
    public void loginFailWithoutPassword() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        Assert.assertTrue(driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0);
        driver.quit();
    }

    @Test
    public void checkTittle() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        driver.quit();
    }

    @Test(groups = "smoke")
    public void checkUrl() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
        driver.quit();
    }
}
