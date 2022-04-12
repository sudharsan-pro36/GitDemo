package section8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Section8Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//enter url
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//select From Country	
		driver.findElement(By.xpath("//h4[text()='From']//following::input")).sendKeys("Paris");
		Thread.sleep(3000);
		List<WebElement> FromList=driver.findElements(By.xpath("//div[contains(@class,'bg-white')]//li//p"));
		System.out.println(FromList.size());
		for(WebElement List1: FromList)
		{
		if(List1.getText().equalsIgnoreCase("Paris, FR - All airports (PAR)"))
		{
		List1.click();
		Thread.sleep(3000);
		break;
		}
		}
		System.out.println(driver.findElement(By.xpath("//h4[text()='From']//following::input")).getText());
//select To Country
		driver.findElement(By.xpath("//h4[text()='To']//following::input")).sendKeys("Chen");
		Thread.sleep(3000);
		List<WebElement> ToList=driver.findElements(By.xpath("//div[contains(@class,'bg-white')]//li//p"));
		System.out.println(ToList.size());
		for(WebElement List2: ToList)
		{
		if(List2.getText().equalsIgnoreCase("Chennai, IN - Chennai Airport (MAA)"))
		{
		List2.click();
		Thread.sleep(3000);
		break;
		}
		}
		System.out.println(driver.findElement(By.xpath("//h4[text()='To']//following::input")).getText());

//select passengers
		WebElement Adult=driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']"));
		Select AdultCount=new Select(Adult);
		AdultCount.selectByValue("4");
		WebElement Child=driver.findElement(By.xpath("//h4[text()='Children']/following::select[@class='bc-neutral-100 bg-transparent']"));
		Select Childcount=new Select(Child);
		Childcount.selectByIndex(2);

//select date
		driver.findElement(By.xpath("//div[contains(@class,'today')]")).click();

//click link and send keys
		driver.findElement(By.linkText("Class of travel, Airline preference")).click();
		driver.findElement(By.cssSelector("[placeholder='Airline name']")).sendKeys("Emirates");

//search flights
		driver.findElement(By.xpath("//button[text()='Search flights']")).click();
		Thread.sleep(1000);

//print error message
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'bg-error')]//span")).getText());
		driver.findElement(By.xpath("//span//following::div[@class='flex flex-middle']")).click();

//Close the driver
		driver.close();
		}
		}