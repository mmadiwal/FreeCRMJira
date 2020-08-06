package com.xpand;
 
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class DemoTest {
	
	WebDriver driver;
	
	public DemoTest() {
		
	}
	
	@BeforeTest
	public void initialization() {
		     System.setProperty("webdriver.chrome.silentOutput", "true");
		     //System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		     WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		     driver.get("https://ui.freecrm.com/");
		     
	}
 
    @Test
    public void loginPageTitleTest() {
				String title=driver.getTitle();
				assertEquals(title, "Cogmento CRMM");
				System.out.println("Title Verified"); 
		  }  
    
    @Test
    public void verifyUrl() {
		String url=driver.getCurrentUrl();
		assertEquals(url, "https://ui.freecrm.comM/");
		System.out.println("Url Verified");
    }
    
    @Test
    public void login() {
    	 driver.findElement(By.name("email")).sendKeys("madiwal.m@gmail.com");
	     driver.findElement(By.name("password")).sendKeys("Alti@33533533");
	     driver.findElement(By.xpath("//div[text()='Login']")).click();
	     String HomePagetext =driver.findElement(By.xpath("//span[text()='Home']")).getText();
	     assertEquals(HomePagetext, "Home");
	     System.out.println("Logged in to FreeCRM successfully");
    }
    
    
    @AfterTest
    public void tearDown() {
    	 driver.quit();
    }
	
}