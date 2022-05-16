package CMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/crm/");
    }

    @Test
    public void TestCase() {
        // Check the title of the page
        WebElement userName = driver.findElement(By.xpath("//*[@id='user_name']"));
        userName.sendKeys("admin");
        WebElement password1 = driver.findElement(By.xpath("//*[@id='username_password']"));
        password1.sendKeys("pa$$w0rd");

        WebElement submit = driver.findElement(By.xpath("//*[@id='bigbutton']"));
        submit.click();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        WebElement Sales = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
        Sales.click();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        WebElement Account = driver.findElement(By.xpath("//*[@id='moduleTab_9_Accounts']"));
        Account.click();

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }

        for (int i=1;i<11;i++) {
            String xpath1 = "//table/tbody/tr[";
            String xpath2 = "]/td[3]/b/a";
            String XpathVariable = xpath1 + i + xpath2;
            WebElement Table1 = driver.findElement(By.xpath(XpathVariable));
            // System.out.println(XpathVariable);
            System.out.println("Here" + Table1.getText());
        }
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
}
