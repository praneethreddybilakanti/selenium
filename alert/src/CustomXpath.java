import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(" http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
driver.findElement(By.xpath("//*[@id='content']/button")).click();
Alert alert = driver.switchTo().alert();
String print = alert.getText();
System.out.println(print);
}
} 