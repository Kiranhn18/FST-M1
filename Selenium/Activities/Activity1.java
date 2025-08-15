package activities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Activity1 {

	public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
		
        driver.get("https://training-support.net");
        
        driver.getTitle();
        
        System.out.println("Title of the page is: " + driver.getTitle());
        
        driver.findElement(By.linkText("About Us")).click();
        
        		
        System.out.println("Title of the page is: " +driver.getTitle());
        
        driver.quit();
        

        
        
        
		
	}

}
