package login;
 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LocateById {
	@Test
    public   void   t_01_validate_zero_app(){
        // navigate to application
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\MY LAPPY\\eclipse-workspace\\digvijay\\src\\login\\exeflie\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://sakshingp.github.io/assignment/login.html");
//find user name
        WebElement txtbx_username = driver.findElement(By.name("username"));
        
        txtbx_username.sendKeys("username");
        
        driver.findElement(By.name("password")).sendKeys("password");
        
        driver.findElement(By.name("log-in")).click();
        
        String expected_title ="Demo App";
        String actual_title =driver.getTitle();
        
        Assert.assertEquals(expected_title, actual_title);
//        click on Amount
        driver.findElement(By.linkText("AMOUNT")).click();
    }

}