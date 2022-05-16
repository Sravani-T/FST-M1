package CMS;
//Reading a popup that contains additional information about the account/lead.

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity7 {
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

        WebElement userLogin = driver.findElement(By.xpath("//*[@id='user_name']"));
        userLogin.sendKeys("admin");
        WebElement Password = driver.findElement(By.xpath("//*[@id='username_password']"));
        Password.sendKeys("pa$$w0rd");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='bigbutton']"));
        submitButton.click();

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ie) {
        }
        WebElement Sales = driver.findElement(By.xpath("//*[@id='grouptab_0']"));
        Sales.click();

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
        }

        WebElement Leads = driver.findElement(By.xpath("//*[@id='moduleTab_9_Leads']"));
        Leads.click();

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }
        WebElement AD = driver.findElement(By.xpath("//*[@id='adspan_6af2edb0-bc40-46d1-7837-5fdc647a1061']"));
        AD.click();
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException ie){
        }

        WebElement mobileNumber = driver.findElement(By.xpath("//span[@class='phone']"));
        System.out.println("Mobile Number--> :   "+ mobileNumber.getText());

        // System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().accept();


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