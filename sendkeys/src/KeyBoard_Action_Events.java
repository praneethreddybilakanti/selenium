import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Action_Events {

public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.stqatools.com");

Actions action = new Actions(driver);

action.sendKeys(Keys.ENTER).build().perform();

action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

}
 
}