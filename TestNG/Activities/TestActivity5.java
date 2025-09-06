package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity5 {
     WebDriver driver;
	
	@BeforeClass
	
	public void Setup() {
	
	driver = new FirefoxDriver();
	
	driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test(groups = { "HeaderTests", "ButtonTests" })
	
	public void pageTitleTest() throws InterruptedException {
		
		System.out.println("Title of the page: "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Selenium:Target Practice");
	Thread.sleep(4000);
	}
	
	@Test (dependsOnMethods = { "pageTitleTest" }, groups = { "HeaderTests" })
    public void HeaderTest1() throws InterruptedException {
        WebElement header3 = driver.findElement(By.xpath("//h3[contains(@class, 'orange')]"));
        Assert.assertEquals(header3.getText(), "Heading #3");
    	Thread.sleep(4000);

	}
	
	@AfterClass
	
	public void Closesetup() {
		driver.quit();
	}
	
	
}
