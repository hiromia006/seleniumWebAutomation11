package seleniumClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        driver.quit();
    }
}
