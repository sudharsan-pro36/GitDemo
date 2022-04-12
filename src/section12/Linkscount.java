package section12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linkscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

//print total links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//Print total links in footer
		WebElement Footer=driver.findElement(By.xpath("//div[contains(@class,' footer_top')]"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		
//Print total links in first column of the footer
		WebElement firstColumn=driver.findElement(By.xpath("//div[contains(@class,' footer_top')]//table/tbody/tr/td[1]/ul"));
		System.out.println(firstColumn.findElements(By.tagName("a")).size());

//loop to open the links of first column
		for(int i=1; i<firstColumn.findElements(By.tagName("a")).size(); i++)
		{
//String opennewtab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		firstColumn.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}
	
		Set<String> handleFirstColumnlinks=driver.getWindowHandles();
		Iterator<String> windowsiterate=handleFirstColumnlinks.iterator();
		while(windowsiterate.hasNext())
		{
		driver.switchTo().window(windowsiterate.next());
		System.out.println(driver.getTitle());
		}
		
		driver.quit();
	}
}
