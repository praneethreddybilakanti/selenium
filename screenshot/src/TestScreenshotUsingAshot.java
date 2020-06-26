import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScreenshotUsingAshot {

public static void main(String[] args) throws IOException {
	
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver  = new ChromeDriver();	

driver.get("http://demo.guru99.com/test/guru99home/");
driver.manage().window().maximize();
			TakesScreenshot t=(TakesScreenshot)driver;
			File SrcFile=t.getScreenshotAs(OutputType.FILE);
			 File DestFile=new File("D://abc");

             //Copy file at destination
 
             FileUtils.copyFile(SrcFile, DestFile);
			

	}

}