package com.TestGoogle;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLogin {
	WebDriver driver;

@ BeforeTest
public void Initialize()
{
	driver = new ChromeDriver() ;
	WebDriverManager.chromedriver().setup();
	driver.manage().window().maximize();
}
 @Test
	public void OpenURl() throws InterruptedException
	{
		
		driver.get("https://www.gmail.com/");
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("seleauto123");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * WebElement element =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		 * element.click(); element.sendKeys("Gadmins@123");
		 */
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Gadmins@123");
		
		  
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Gadmins@123");
		//driver.findElement(By.xpath("span[contains(text(),'Forgot password?')]")).click();
		/*
		 * WebElement password = driver.findElement(By.name("password"));
		 * password.sendKeys("Gadmins@123");
		 */
	
	}
	
	  @AfterTest public void Close_Browser()
	  {
		  driver.quit();
	  
	  }
	 
}
