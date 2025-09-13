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

public class Activity3 {
	//3. Get the url of the header image
	WebDriver driver;
	WebDriverWait wait;
	
@BeforeClass
 public void setup() {
	driver = new  FirefoxDriver();
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https:/alchemy.hguy.co/jobs/");
}

@Test
public void HeaderImageUrl() {

    WebElement image = driver.findElement(By.cssSelector("img.wp-post-image"));
    String imageUrl = image.getAttribute("src");
	System.out.println(imageUrl);
	
}
@AfterClass
public void tearDown() {
	driver.quit();
}
	
}
