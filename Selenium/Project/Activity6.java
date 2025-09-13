package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {
	/*
	 * 6. Apply to a job Goal: Search for a job and apply for it a. Open browser
	 * with Alchemy Jobs site and navigate to the Jobs page. b. Search for a
	 * particular job and wait for listings to show. c. Click and open any one of
	 * the jobs listed. d. Click the apply button and print the email to the
	 * console. e. Close the browser.
	 */
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://alchemy.hguy.co/jobs/jobs/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));

	}

	@Test(priority = 1)
	public void ClickJobs() throws InterruptedException {
		WebElement text = driver.findElement(By.xpath("//a[text()='Jobs']"));
		text.click();
		Thread.sleep(4000);
	}

	@Test(priority = 2)
	public void SearchJobs() throws InterruptedException {
		WebElement SearchKeyword = driver.findElement(By.id("search_keywords"));
		SearchKeyword.sendKeys("Banking");
		Thread.sleep(4000);
		WebElement SearchJob = driver.findElement(By.xpath("//input[@value='Search Jobs']"));
		SearchJob.click();
		Thread.sleep(4000);
		 WebElement Job = driver.findElement(By.xpath("//h3[text()='SAP Testing']"));
		Job.click();
		Thread.sleep(4000);
	}

	@Test(priority = 3)
	public void ApplyJobs() throws InterruptedException { 
		WebElement ApplyJob = driver.findElement(By.xpath("//input[@type='button' and @value='Apply for job']"));
        ApplyJob.click(); 
        Thread.sleep(4000);

        // ✅ Get the job application email
        WebElement emailLink = driver.findElement(By.xpath("//a[@class='job_application_email']"));
        System.out.println("Job application email is: " + emailLink.getText());
    }

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
