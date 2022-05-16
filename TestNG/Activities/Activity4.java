package CMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Open the site and login with the credentials provided

public class Activity4 {
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
    }
 @Test
        public void Test_assert_equals() throws InterruptedException
        {
            String exp_title = "SuiteCRM";
            String test_url = "https://alchemy.hguy.co/crm/";

            //driver.manage().window().maximize();
            driver.get(test_url);
            Thread.sleep(3000);

            String curr_window_title = driver.getTitle();
            /* Hard Assert */
            Assert.assertEquals(curr_window_title, exp_title);
            System.out.println("Launched correct Homepage \n");
        }


    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}