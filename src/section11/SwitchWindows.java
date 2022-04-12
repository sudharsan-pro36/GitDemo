package section11;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

//open another window
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
//Declare Switch Windows function
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> manageWindows= windows.iterator();
		String parentWindowId=manageWindows.next();
		String childWindowId=manageWindows.next();
		
//Switch to child Window
		driver.switchTo().window(childWindowId);

//Get only the required text from the line
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String mailid=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
//Switch to parent window and enter mail id
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("username")).sendKeys(mailid);
		driver.switchTo().window(childWindowId);
		driver.close();
		
	}

}
