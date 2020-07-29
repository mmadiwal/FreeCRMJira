package com.xpand;
 
import static org.testng.Assert.assertEquals;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;




 
public class DemoTest {
	
	WebDriver driver;
	
	
	public DemoTest() {
		
	}
 
    @Test
    public void loginPageTitleTest() { 
		 
			   System.setProperty("webdriver.chrome.silentOutput", "true");
			   WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				driver.get("https://ui.freecrm.com/");
				String title=driver.getTitle();
				assertEquals(title, "Cogmento CRM");
				System.out.println("Title Verified"); 
		        driver.quit();
		  }   
    @Test
    public void verifyUrl() {
    	
 	   System.setProperty("webdriver.chrome.silentOutput", "true");
	   WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		String url=driver.getCurrentUrl();
		assertEquals(url, "https://ui.freecrm.com/");
		System.out.println("Url Verified");
        driver.quit();
    }
	
}