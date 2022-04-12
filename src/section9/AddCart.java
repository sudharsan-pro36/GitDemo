package section9;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCart {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(driver,5);
//Create Array
		String[] itemsNeeded= {"Beetroot", "Brinjal","Mushroom","Onion"};

//enter url
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		//AddCart obj=new AddCart();
		//obj.additmes(driver, itemsNeeded);
//call the method
		additems(driver, itemsNeeded);
		AddCart object=new AddCart();
		object.checkout(driver);

	}

//Method to additems
public static void additems(WebDriver driver,String[] itemsNeeded)
{
//identify total elements	
		List<WebElement> TotalItems = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(TotalItems.size());

//Loop to add desired item
		for(int i=0; i<TotalItems.size(); i++)
		{
		String[] itemName=TotalItems.get(i).getText().split("-");
		String formattedItemName=itemName[0].trim();
//Convert Array to Arraylist
		List itemsNeededList=Arrays.asList(itemsNeeded);
		
//Check the condition
		int j=0;
		if(itemsNeededList.contains(formattedItemName))
		{
		j++;
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==4)
		{
		break;
		}
		}
		
		}
//print the item count added
	System.out.println(driver.findElement(By.xpath("//td[text()='Items']/following::strong")).getText());
	}

//MEthod to Checkout
public void checkout(WebDriver driver)
{
driver.findElement(By.cssSelector("img[alt='Cart']")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
//Explicit WaitDeclaration
WebDriverWait wait=new WebDriverWait(driver,5);
//Wait Used
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
driver.findElement(By.cssSelector("button.promoBtn")).click();
//Wait Used
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
driver.close();
}
}
