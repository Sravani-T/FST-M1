package CMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Instant;

//Make sure that the “Activities” menu item exists and is clickable
public class Activity6 {
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
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
        }

        WebElement Activities = driver.findElement(By.xpath("//*[@id=\"grouptab_3\"]"));
        Assert.assertTrue(Activities.isDisplayed());
      //  Assert.assertEquals("ACTIVITIES", Activities);


        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}
