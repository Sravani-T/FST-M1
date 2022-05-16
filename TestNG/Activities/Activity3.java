package CMS;
//Print the first copyright text in the footer to the console


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
    }

    @Test
    public void Check() {
        WebElement text = driver.findElement(By.id("admin_options"));
        System.out.println("first copyright text is: "+ text.getText());
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
