package section12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;



public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
//click calendar field
				driver.findElement(By.id("travel_date")).click();
				
//select month
		while(!driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='datepicker-switch']")).getText().contains("January"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
				
//row size
	int rowSize=driver.findElements(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-days']//tbody//tr")).size();
	System.out.println(rowSize);
//column size
	int columnSize=driver.findElements(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-days']//thead//th[@class='dow']")).size();
	System.out.println(columnSize);
	String datetobeSelected="19";
//Loop to select date
	for(int i=1; i<=rowSize; i++)
	{
	for(int j=1;j<=columnSize; j++)
	{
	String Dates=driver.findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-days']//tbody//tr["+i+"]//td["+j+"]")).getText();
	if(Dates.equalsIgnoreCase(datetobeSelected))
	{
	driver.findElement(By.xpath("//div[contains(@class,'datepicker-dropdown')]//div[@class='datepicker-days']//tbody//tr["+i+"]//td["+j+"]")).click();
	break;
	}
	}
		}
		
	}

}



//close pop up
		/*WebDriverWait wait=new WebDriverWait(driver,100);
		WebElement Close=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='listbuilder-popup-scale']//div[@class='sumome-react-svg-image-container']")));
		Close.click();*/
