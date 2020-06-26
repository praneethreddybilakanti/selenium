package lcom.levadata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver d=new ChromeDriver();

d.get("https://www.seleniumhq.org/");
d.findElement(By.linkText("Download")).click();
	System.out.println(d.getTitle());
String handle=d.getWindowHandle();
System.out.println(handle);

	//d.close();
	}
}
