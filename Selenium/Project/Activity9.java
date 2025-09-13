package seleniumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {
	//9. Create a job listing using the backend
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	}
	@Test (priority=1)
	public void LoginToWebsite() throws InterruptedException {
		WebElement usernameField = driver.findElement(By.xpath("//input[@id='user_login']"));
		usernameField.sendKeys("root");
		Thread.sleep(500);
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='user_pass']"));
		passwordField.sendKeys("pa$$w0rd");
		Thread.sleep(500);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		loginButton.click();
		Thread.sleep(500);
		
		System.out.println("Logged in Successfully");
	}
		
		@Test (priority=2)
		public void jobListing() {
			driver.findElement(By.linkText("Post a Job")).click();
			driver.findElement(By.id("create_account_email")).sendKeys("Kiran1896@gmail.com");
			driver.findElement(By.id("job_title")).sendKeys("Automation Tester");
			
			Select option=new Select (driver.findElement(By.id("job_type")));
			
			option.selectByValue("3");
			driver.findElement(By.id("job_description_ifr")).sendKeys("Required Manual Tester with 5 years of experience is required.");
			driver.findElement(By.id("application")).sendKeys("https://www.ibmtest.com/c/en/us/about/careers.html");
			driver.findElement(By.id("company_name")).sendKeys("cisco");
			
			driver.findElement(By.xpath("//input[@value='Preview']")).click();
			driver.findElement(By.id("job_preview_submit_button")).click();
			
			
		//WebElement companyWebsite = driver.findElement(By.xpath("//input[@id='_company_website']"));
		//companyWebsite.sendKeys("https://Ibmexample.com");


	}

}
