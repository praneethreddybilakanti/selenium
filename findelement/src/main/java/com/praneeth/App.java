package com.praneeth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		// create an instance for web driver by using ChromeDriver class
		WebDriver driver = new ChromeDriver();
		System.out.println("driver:" + driver);
		// open the google url by using get method
		driver.get("https://www.facebook.com");

		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("praneeth");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("praneeth@1211");
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		driver.findElement(By.id("userNavigationLabel")).click();
		WebElement logout = driver.findElement(By.linkText("Log Out"));
		logout.click();
		driver.close();

	}
}
