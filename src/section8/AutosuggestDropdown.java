package section8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutosuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//initiate chrome driver
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//launch url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//Click country field
		driver.findElement(By.id("autosuggest")).sendKeys("sw");
		Thread.sleep(5000);
//get the list count
		List<WebElement> CountryList=driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		System.out.println(CountryList.size());
//iterate and find the element
		
		for(WebElement Country :CountryList )
		{
			if(Country.getText().equalsIgnoreCase("Sweden"))
			{
				Country.click();
				Thread.sleep(3000);
				//System.out.println(driver.findElement(By.id("autosuggest")).getText());
				break;
			}
		}
	//driver.close();
	}

}
