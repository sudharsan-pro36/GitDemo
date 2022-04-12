import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClassfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


// Initiate ChromeDriver
					System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
// enter url
					driver.get("https://www.amazon.com/");
					driver.manage().window().maximize();
//Declaring Actions Class
					Actions actCmd= new Actions(driver);
					WebElement signin=driver.findElement(By.cssSelector("a#nav-link-accountList"));

//Enter keywords
					WebElement searchtext=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
					//actCmd.moveToElement(searchtext).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
			
					
				driver.findElement(By.cssSelector("#v4GAYPUrsmcsJc2nsdvi2g")).getText();
				/*WebElement text=driver.findElement(By.xpath("//span[@class='a-size-base a-color-base']"));
				text.click();
				text.sendKeys(Keys.CONTROL);
				text.sendKeys("A");
				text.sendKeys(Keys.CONTROL);
				text.sendKeys("C");
				
				searchtext.click();
				searchtext.sendKeys(Keys.CONTROL,"V");*/
			
//Hover
					
					//actCmd.moveToElement(signin).contextClick().build().perform();
			}



		}
