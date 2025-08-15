package activities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class Activity2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		driver.get(" https://training-support.net/webelements/login-form/");
		
		System.out.println("Title of the webpage: "+ driver.getTitle());
		
		
		
	}

}
