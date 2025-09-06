package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testactivity2 {
		WebDriver driver;
	//WebDriverWait waits;
	
@BeforeClass

public void Setup() {
driver= new FirefoxDriver();
driver.get(" https://training-support.net/webelements/target-practice/");

}
	
	@Test
	public void testCase1() throws InterruptedException {
        // This test case will pass
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "Selenium: Target Practice");
        Thread.sleep(4000);

	}	
	
	@Test
	public void testCase2() throws InterruptedException {
        // This test case will Fail
        WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(), "black");
        Thread.sleep(3000);

	}
	@Test (enabled = false)
    public void testCase3() throws InterruptedException {
        // This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
        Thread.sleep(3000);

	}
	@Test
	public void testCase4() {
        // This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");

	}

	@AfterClass
	public void tearDown() {
	    // Close the browser
	    driver.quit();

}
}
