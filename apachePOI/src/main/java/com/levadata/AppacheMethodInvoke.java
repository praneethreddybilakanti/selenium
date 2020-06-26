package com.levadata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AppacheMethodInvoke 
{
	WebDriver driver = null;
	WebDriverWait wait=null;
	@DataProvider(name="user")
	public Object[][] getDetails() {
	 
		
		  Object obj[][] = new Object[2][2]; 
		 obj[0][0]="fitbit.user3@fbit.com";
		  obj[0][1]="Test@1234";
		  obj[1][0]="fitbit.user3@fbit.com";
		  obj[1][1]="Test@1234";
		  
		  return  obj;
		 
	}
	
	@Test(dataProvider = "user")
	public void login(String name,String password) throws InterruptedException
	{
		System.out.println("usename"+name+"password"+password);

		
		  System.setProperty("webdriver.chrome.driver",
		  "D:\\chromedriver_win32\\chromedriver.exe"); 
		  driver = new ChromeDriver(); 
		 // Maximize the window.
		  driver.manage().window().maximize();
		  driver.navigate().to("https://frontdoorqan.levadata.net/levadata/#/login");
		  driver.findElement(By.name("email")).sendKeys(name);
		  driver.findElement(By.name("password")).sendKeys(password);
		  
		  // Click on the search button 
		  driver.findElement(By.id("login")).click();
		  Thread.sleep(4000);
		 }
	}
