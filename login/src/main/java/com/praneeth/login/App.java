package com.praneeth.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    	    WebDriver driver=new ChromeDriver();
    	 // Maximize the window.
    	 driver.manage().window().maximize();
    	 // Enter UserName
    	 driver.navigate().to("https://qaneutron.levadata.net/levadata/#/login");  
    	 
    	 // Click on the search text box and send value  
    	 driver.findElement(By.name("email")).sendKeys("praneeth.bilakanti@mailinator.com"); 
    	 driver.findElement(By.name("password")).sendKeys("Test@1234"); 

    	 // Click on the search button  
    	   driver.findElement(By.id("login")).click();

    	  // driver.navigate().to("https://qaneutron.levadata.net/levadata/#/app/dashboard");
    	   driver.findElement(By.linkText("...")).click();

    	   driver.navigate().forward();    }
    }

