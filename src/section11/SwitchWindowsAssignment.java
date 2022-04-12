package section11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Initiate ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
				driver.get("https://the-internet.herokuapp.com/");
				driver.manage().window().maximize();
				WebElement link=driver.findElement(By.linkText("Multiple Windows"));
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", link);
				link.click();
				
//click to open Child Window
				driver.findElement(By.linkText("Click Here")).click();
			
//Declare  Switch Windows function
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> switchwindows=windows.iterator();
				String parentid=switchwindows.next();
				String Childid=switchwindows.next();
//switch to child window
				driver.switchTo().window(Childid);
				System.out.println(driver.findElement(By.cssSelector(".example")).getText());

//Switch back to Parent Window
				driver.switchTo().window(parentid);
				System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
				driver.quit();
	}

}
