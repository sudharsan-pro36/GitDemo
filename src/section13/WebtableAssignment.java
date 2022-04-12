package section13;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAssignment {

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
		
//find the table element
		WebElement table=driver.findElement(By.name("courses"));
		
//row count
	System.out.println(table.findElements(By.tagName("tr")).size());
	
//column count
	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	
//Print the Second Row
	List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	System.out.println(secondrow.get(0).getText());
	System.out.println(secondrow.get(1).getText());
	System.out.println(secondrow.get(2).getText());
	driver.close();
	
}
}
