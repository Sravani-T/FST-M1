package CMS;

//Get the color of the navigation menu

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test
    public void Login() {
        //*[@id="user_login"]

        WebElement userLogin = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
        userLogin.sendKeys("admin");
        WebElement Password = driver.findElement(By.xpath("//*[@id=\"username_password\"]"));
        Password.sendKeys("pa$$w0rd");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"bigbutton\"]"));
        submitButton.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
        }



     String bckgclr = driver.findElement(By.id("toolbar")).getCssValue("color");
        System.out.println(bckgclr);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
        }

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}