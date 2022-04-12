package section11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		WebElement Link=driver.findElement(By.linkText("Nested Frames"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview",Link);
		Link.click();
		
//Switch to Top frame and get size
		WebElement top=driver.findElement(By.cssSelector("frame[name='frame-top']"));
		driver.switchTo().frame(top);
		System.out.println(driver.findElements(By.tagName("frame")).size());

//switch to inner frame and print the text
		WebElement middle=driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		driver.switchTo().frame(middle);
		System.out.println(driver.findElement(By.cssSelector("#content")).getText());
	}

}
