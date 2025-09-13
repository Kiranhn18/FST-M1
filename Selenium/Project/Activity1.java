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

public class Activity1 {
	//1. Verify the website title
	
	WebDriver driver;
	WebDriverWait wait;
	
@BeforeClass
 public void setup() {
	driver = new  FirefoxDriver();
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https:/alchemy.hguy.co/jobs/");
	
}

@Test
public void WebpageTitle() {
	String title = driver.getTitle();
	Assert.assertEquals(title, "Alchemy Jobs – Job Board Application");
}

@AfterClass
public void tearDown() {
	driver.quit();
}
}

