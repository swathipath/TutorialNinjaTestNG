package com.tutorialsninja.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class RegistrationTest {
	    WebDriver driver=new ChromeDriver();
	    @BeforeSuite	  
		public void initBrowser()
		{			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("https://tutorialsninja.com/demo/");			
		}
	    
	    @Test
	    public void validRegisterData()
	    {
	    	driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			driver.findElement(By.name("firstname")).sendKeys("suba");
			driver.findElement(By.name("lastname")).sendKeys("shini");
			driver.findElement(By.name("email")).sendKeys("xxx@gmail.com");
			driver.findElement(By.name("telephone")).sendKeys("2222222");
			driver.findElement(By.name("password")).sendKeys("ppp");
			driver.findElement(By.name("confirm")).sendKeys("ppp");
			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
			
	    }
	    
	    @AfterSuite
	    public void closeBrowser()
	    {
	    	//driver.close();
	    }
}
