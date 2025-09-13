package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	//7. Create a new job listing Goal: Create a new job listing a. Open a browser.
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs");
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	}

	@Test(priority = 1)
	public void PostJobs() throws InterruptedException {
		WebElement postjob = driver.findElement(By.xpath("//a[text()='Post a Job']"));
		postjob.click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void JobDetails() throws InterruptedException {
		WebElement email = driver.findElement(By.xpath("//input[@id='create_account_email']"));
		email.click();
		email.sendKeys("Imbkiran108@gmail.com");
		Thread.sleep(2000);

		WebElement jobtitle = driver.findElement(By.xpath("//input[@name='job_title']"));
		jobtitle.click();
		jobtitle.sendKeys("Test Specialist");
		Thread.sleep(2000);

		WebElement location = driver.findElement(By.xpath("//input[@name='job_location']"));
		location.click();
		location.sendKeys("Mumbai");
		Thread.sleep(2000);

		WebElement jobtype = driver.findElement(By.xpath("//select[@id='job_type']"));
		Select type = new Select(jobtype);
		type.selectByVisibleText("Full Time");
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")));

		WebElement editorBody = driver.findElement(By.tagName("body"));
		editorBody.clear();
		editorBody.sendKeys("Job Description : Manual Tester with strong knowledge of Mobile Testing and Web Application Testing");
		Thread.sleep(2000);
        driver.switchTo().parentFrame();
        
		WebElement applicationField = driver.findElement(By.cssSelector("input[name='application']"));
		applicationField.sendKeys("ibmhr@company.com");
		Thread.sleep(2000);

		WebElement companyName = driver.findElement(By.cssSelector("#company_name"));
        companyName.sendKeys("IBM-Alchemy Solutions Pvt Ltd");
		Thread.sleep(2000);
		
		WebElement Website = driver.findElement(By.cssSelector("#company_website"));
		Website.sendKeys("https://www.alchemysolutions.com");
		Thread.sleep(2000);
		
		WebElement Tagline = driver.findElement(By.cssSelector("#company_tagline"));
		Tagline.sendKeys("Innovating the Future of Technology and project");
		Thread.sleep(2000);
		
		WebElement previewButton = driver.findElement(By.cssSelector("input[value='Preview']"));
        previewButton.click();
		Thread.sleep(2000);

		WebElement submitButton = driver.findElement(By.cssSelector("#job_preview_submit_button"));
        submitButton.click();
		Thread.sleep(4000);

		WebElement jobsLink = driver.findElement(By.xpath("//a[text()='Jobs']"));
        jobsLink.click();
		Thread.sleep(2000);

        
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search_keywords']"));
        searchBox.sendKeys("Test");
		Thread.sleep(4000);

		WebElement searchJobsBtn = driver.findElement(By.xpath("//input[@value='Search Jobs']"));
        searchJobsBtn.click();
		Thread.sleep(4000);
	}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
	}

}
