package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
	//2. Verify the website heading

	WebDriver driver;
	WebDriverWait wait;
	
@BeforeClass
 public void setup() {
	driver = new  FirefoxDriver();
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https:/alchemy.hguy.co/jobs/");
}

@Test
public void WebsiteHeading() {
	String text = driver.findElement(By.cssSelector("h1.entry-title")).getText();
	Assert.assertEquals(text, "Welcome to Alchemy Jobs");
	System.out.println("Website Heading is: " + text );

}
@AfterClass
public void tearDown() {
	driver.quit();
}
}
	
	