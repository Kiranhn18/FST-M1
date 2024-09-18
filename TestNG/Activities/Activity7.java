package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
 
	public class Activity7 {
		WebDriver driver;
	    WebDriverWait wait;
	
	    @Test (dataProvider = "Authentication")
	    public void loginTestCase(String username, String password) {
	        //Find username and pasword fields
	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        
	        //Enter values
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        
	        //Click Log in
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	        
	        //Assert Message
	        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	        Assert.assertEquals(loginMessage, "Welcome Back, admin");
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
		       WebDriverManager.firefoxdriver().setup();
		        driver = new FirefoxDriver();
		        driver.get("https://v1.training-support.net/selenium/login-form");
		 	    }
	    	

	    @AfterClass
	    public void afterClass() {
	        //Close browser
	        driver.close();
	    }
	  @DataProvider(name = "Authentication")
	    public static Object[][] credentials() {
	        return new Object[][] { { "admin", "password" }};
	    }	
}
