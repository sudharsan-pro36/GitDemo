package section8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//Initiate ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
//enter url
				driver.get("https://www.cleartrip.com");
				driver.manage().window().maximize();
				Thread.sleep(5000);

//select passengers
				WebElement Adult=driver.findElement(By.xpath("//select[@class='bc-neutral-100 bg-transparent']"));
				Select AdultCount=new Select(Adult);
				AdultCount.selectByValue("4");
				WebElement Child=driver.findElement(By.xpath("//h4[text()='Children']/following::select[@class='bc-neutral-100 bg-transparent']"));
				Select Childcount=new Select(Child);
				Childcount.selectByIndex(2);

//select date
				driver.findElement(By.xpath("//div[contains(@class,'p-relative homeCalender')]")).click();
				driver.findElement(By.xpath("//div[contains(@class,'today')]")).click();

//click link and send keys
				driver.findElement(By.partialLinkText("Class of travel, Airline preference")).click();
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
	
