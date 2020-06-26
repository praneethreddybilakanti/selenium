package com.levadata.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CurrentQurterFile {

	WebDriver driver = null;

	@BeforeClass
	public void lookupClass() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.navigate().to("https://qaneutron.levadata.net/levadata/#/login");
		// Click on the search text box and send value
				driver.findElement(By.name("email")).sendKeys("praneeth.bilakanti@mailinator.com");
				driver.findElement(By.name("password")).sendKeys("Test@1234");

				// Click on the search button
				driver.findElement(By.id("login")).click();
			
	}

	@Test
	public void testMethod() throws InterruptedException {

			Thread.sleep(2000);
		// driver.getPageSource();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Lookup"))).
		  click(); 
		  /*wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "multiselectsearchresult"))).click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "placeholder_MPN"))).sendKeys("BAT30F4"); Thread.sleep(2000);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated( By.
		 * xpath("//div[@class='search-text-overflow leva-text-overflow ng-star-inserted']"
		 * ))).click(); Thread.sleep(8000);
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//i[@class='ld-icon-next ld-white']"))) .click();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//i[@id='cost_export']"))) .click();
		 * 
		 * 
		 */
		  }
	
	@Test
	public void fileUpload() throws InterruptedException {
		Thread.sleep(3000);
	System.out.println("file upload ");
	WebElement upload=driver.findElement(By.name("selectFile"));
upload.sendKeys("D:\\Commodity_Cost.xlsx");
	
	driver.findElement(By.id("fileuploadicon")).click();
	}
	
	@AfterClass
	public void closeDriver() throws InterruptedException {
Thread.sleep(9000);
		/*
		 * driver.findElement(By.xpath("//button[@id='dropdownlist'] ")).click();
		 * driver.findElement(By.xpath("//a[@id='logout'] ")).click();
		 */
	}
}
