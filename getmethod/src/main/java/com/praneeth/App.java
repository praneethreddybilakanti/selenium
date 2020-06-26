package com.praneeth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32 (2)\\chromedriver.exe");
		// create an instance for web driver by using ChromeDriver class
		WebDriver driver = new ChromeDriver();
		System.out.println("driver:" + driver);
		// open the google url by using get method
		driver.get("https://www.google.com");
		// navigate to facebook application
		driver.navigate().to("https://facebook.com");
		// navigate back to google web page
		driver.navigate().back();
		// navigate forward to facebook
		driver.navigate().forward();

	}
}


