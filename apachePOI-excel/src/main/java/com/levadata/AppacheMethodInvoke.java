package com.levadata;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppacheMethodInvoke {
	WebDriver driver = null;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// Maximize the window.
		System.out.println("window maximized");
		driver.manage().window().maximize();
		System.out.println("open levadata website");
		driver.navigate().to("https://frontdoorqan.levadata.net/levadata/#/login");

	}

	@Test(dataProvider = "testGetData")
	public void loginMethodTest(String username, String pwd) {
		System.out.println("login");
		System.out.println(username);
		System.out.println(pwd);
		System.out.println("username" + username);
		System.out.println("login verification");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pwd);

		// Click on the search button
		driver.findElement(By.id("login")).click();

	}

	@DataProvider
	public Object[][] testGetData() throws InvalidFormatException, IOException {
		DataUtils.getdataFromExcel();
		Object[][] obj = DataUtils.setInfo();
		for (Object[] o : obj) {
			for (Object j : o) {
				System.out.println("username&paasword" + j);
			}
		}

		return obj;

	}

	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("driver has quited");
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownlist"))).click();
		// driver.findElement(By.xpath("//button[@id='dropdownlist'] ")).click();
		// driver.findElement(By.xpath("//a[@id='logout'] ")).click();
		driver.findElement(By.id("logout")).click();
		driver.quit();
	}

}