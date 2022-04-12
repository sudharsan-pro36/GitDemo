package section9;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;



public class fluentwaittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Initiate ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//WebDriverWait wait=new WebDriverWait(driver,5);
// enter url
				driver.get("https:the-internet.herokuapp.com");
				driver.manage().window().maximize();

				driver.findElement(By.linkText("Dynamic Loading")).click();
				driver.findElement(By.partialLinkText("Example 1")).click();
				driver.findElement(By.xpath("//button[text()='Start']")).click();
//Fluent Wait				
				Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
				
				WebElement hello=wait.until(new Function<WebDriver,WebElement>()
				{
				public WebElement apply(WebDriver driver)
				{
				if(driver.findElement(By.xpath("//div[@id='finish']//h4")).isDisplayed())
				{
				return driver.findElement(By.xpath("//div[@id='finish']//h4"));
				}
				else
					return null;
				}
				});
				System.out.println(driver.findElement(By.xpath("//div[@id='finish']//h4")).getText());
				}
				}
