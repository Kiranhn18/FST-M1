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

public class Activity5 {
//5. Navigate to another page Goal: Navigate to the “Jobs” page on the site. a.
	 
	WebDriver driver;
	WebDriverWait wait;
	
@BeforeClass
 public void setup() {
	driver = new  FirefoxDriver();
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https:/alchemy.hguy.co/jobs/");
}
@Test
public void AnotherPage() {
	WebElement text = driver.findElement(By.xpath("//a[text()='Jobs']"));
          text.click();
      	wait = new WebDriverWait(driver, Duration.ofSeconds(15));

          String title = driver.getTitle();
        	System.out.println("Title of the Second Page is: " + title);
      	Assert.assertEquals(title, "Jobs – Alchemy Jobs");
}
@AfterClass
public void tearDown() {
	driver.quit();
}
}
