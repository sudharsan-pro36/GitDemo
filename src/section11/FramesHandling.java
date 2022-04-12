package section11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initiate ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();
				
//Identify frame count and switch to frame
				System.out.println(driver.findElements(By.tagName("iframe")).size());
				WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
				driver.switchTo().frame(frame);
//Declare Action Class
				Actions Act=new Actions(driver);
				
//Drag and Drop
				WebElement Drag=driver.findElement(By.id("draggable"));
				WebElement Drop=driver.findElement(By.id("droppable"));
				Act.dragAndDrop(Drag, Drop).build().perform();
				System.out.println(driver.findElement(By.id("droppable")).getText());
				
//switch back to default
				driver.switchTo().defaultContent();
				driver.findElement(By.linkText("Resizable")).click();
				System.out.println(driver.findElement(By.cssSelector(".entry-title")).getText());
				

	}

}
