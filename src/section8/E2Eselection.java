package section8;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2Eselection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//launch url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//trip type selection and validation
Assert.assertTrue(driver.findElement(By.cssSelector("input[value='OneWay']")).isSelected());
Assert.assertFalse(driver.findElement(By.cssSelector("input[value='RoundTrip']")).isSelected());
driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();

//Return Date Enabled
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
	System.out.println("Return Date Enabled for RoundTrip");
	Assert.assertTrue(true);
		}
else
{
	System.out.println("Return Date Not Enabled for RoundTrip");
	Assert.assertTrue(false);
}

//select Origin City
driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
driver.findElement(By.cssSelector("a[value='MAA']")).click();
Thread.sleep(1000);

//Select Destination City
driver.findElement(By.xpath("//div[contains(@id,'destinationStation')]//a[@value='STV']")).click();
Thread.sleep(2000);

//select from date
driver.findElement(By.cssSelector(".ui-state-highlight")).click();
Thread.sleep(1000);

//Select To Date
driver.findElement(By.xpath("//div[@id='Div1']//button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[contains(@class,'group-last')]//table[@class='ui-datepicker-calendar']//a[text()='1']")).click();

//Select passengers
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(1000);
for(int i=1;i<=3;i++)
{
driver.findElement(By.id("hrefIncAdt")).click();
	}
driver.findElement(By.id("hrefIncChd")).click();
driver.findElement(By.id("btnclosepaxoption")).click();

//Select Currency
WebElement Currency=driver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]"));
Select Currencydropdown=new Select(Currency);
Currencydropdown.selectByIndex(2);
System.out.println(Currencydropdown.getFirstSelectedOption().getText());

//Select special assistance
driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_IndArm")).isSelected());

//Search
driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

driver.close();
}
}