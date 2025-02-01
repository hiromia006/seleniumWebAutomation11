package testngClass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoMethodTest extends BaseSauceDemoMethodTest {
    @Test(enabled = false)
    public void login2() throws InterruptedException {
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("#login-button")).click();

        String ti = driver.findElement(By.cssSelector(".title")).getText().trim();
        Assert.assertEquals(ti, "Products");

    }

    @Test(groups = "smoke")
    public void loginFailWithoutUsername() throws InterruptedException {
        driver.findElement(By.cssSelector("#password")).clear();
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#login-button")).click();

        Assert.assertTrue(driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0);

    }

    @Test
    public void loginFailWithoutUsernameAndPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("#user-name")).clear();
        driver.findElement(By.cssSelector("#password")).clear();
        driver.findElement(By.cssSelector("#login-button")).click();

        Assert.assertTrue(driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0);

    }

    @Test
    public void loginFailWithoutPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        Assert.assertTrue(driver.findElements(By.cssSelector("h3[data-test='error']")).size() > 0);

    }

    @Test
    public void checkTittle() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }

    @Test
    public void checkUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

    }
}
