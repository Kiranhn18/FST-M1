package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
	//8. Login into the website’s backend
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	}
	@Test
	public void LoginToWebsite() throws InterruptedException {
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='user_login']"));
		usernameField.sendKeys("root");
		Thread.sleep(500);
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='user_pass']"));
		passwordField.sendKeys("pa$$w0rd");
		Thread.sleep(500);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		loginButton.click();
		Thread.sleep(2000);
		
		System.out.println("Logged in Successfully");
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
