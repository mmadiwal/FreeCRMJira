package com.xpand;
 
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
				//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			   WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
				driver.get("https://ui.freecrm.com/");
				String title=driver.getTitle();
				System.out.println(" FreeCrm login page title "+title); 
		        //driver.quit();
		  }    
	
}