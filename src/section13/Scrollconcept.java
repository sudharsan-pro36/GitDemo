package section13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrollconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Initiate ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.manage().window().maximize();

//javascript to scroll the page (vertical)
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,500)");
				js.executeScript("document.querySelector('.tableFixHead').scrollTop=300");
				
//get the list of numbers column to add
				List<WebElement> amount=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
				int sumAmount=0;
				for(int i=0; i<amount.size();i++)
				{
					sumAmount = sumAmount+Integer.parseInt(amount.get(i).getText());
				}
				System.out.println("Expected amount displayed is:" + " " +sumAmount);
				int inapp=Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
				Assert.assertEquals(sumAmount, inapp);
				//System.out.println("Actual amount displayed is:" + " " + Actual);
				driver.close();
	}

}
