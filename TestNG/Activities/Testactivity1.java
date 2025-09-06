package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testactivity1 {
	WebDriver driver;
	//WebDriverWait waits;
	
@BeforeClass

public void Setup() {
driver= new FirefoxDriver();
driver.get("https://training-support.net");


}
@Test
public void homePageTest() throws InterruptedException {
    // Assert page title
    Assert.assertEquals(driver.getTitle(), "Training Support");
    
    // Find and click the About page link
    driver.findElement(By.linkText("About Us")).click();
    Thread.sleep(3000);
    
}
    
    @Test(priority = 2)
    public void aboutPageTest() throws InterruptedException {
        // Assert page title
        Assert.assertEquals(driver.getTitle(), "About Training Support");
        Thread.sleep(3000);

    }
    

@AfterClass

public void tearDown() {
    // Close the browser
    driver.quit();
}

}
	 
