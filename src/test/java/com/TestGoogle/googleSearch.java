package com.TestGoogle;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleSearch {

WebDriver driver;
@BeforeTest
public void Initialise()
{
 driver = new ChromeDriver();
 WebDriverManager.chromedriver().setup();
 driver.manage().window().maximize();
 driver.get("http://www.google.com");
 driver.findElement(By.id("L2AGLb")).click();
}
@Test

public void Search()
{

	driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	String actualResult= driver.getTitle();
	Assert.assertEquals(actualResult, "Selenium - Google Suche");
}

@Test

public void Link_Click()
{
	driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	driver.findElement(By.linkText("Selenium")).click();
}
/*
 * @AfterTest public void Close_Browser() { driver.quit(); }
 */
 
}
