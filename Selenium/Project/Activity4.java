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

public class Activity4 {
	//4. Verify the website’s second heading
	
	WebDriver driver;
	WebDriverWait wait;
	
@BeforeClass
 public void setup() {
	driver = new  FirefoxDriver();
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https:/alchemy.hguy.co/jobs/");
}

@Test
public void SecondHeading() {
	String text = driver.findElement(By.cssSelector("h2")).getText();
	Assert.assertEquals(text, "Quia quis non");
	System.out.println("Second Heading On The Page is: " + text );
	
}
@AfterClass
public void tearDown() {
	driver.quit();
}
}
