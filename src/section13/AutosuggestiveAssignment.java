package section13;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutosuggestiveAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//enter url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
//click autosuggestion field
				driver.findElement(By.id("autocomplete")).sendKeys("ind");
				
//select India
				List<WebElement> listedItems=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
				for(WebElement Country:listedItems)
				{
				  driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
				if(Country.getText().equalsIgnoreCase("India"))
					{
					break;
					}
					
				}
			System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));	
			driver.close();
			}

		}


