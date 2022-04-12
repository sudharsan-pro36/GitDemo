package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//enter url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//click Destination
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
 //Count Columns 
  int colcount=driver.findElements
(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//h3[text()='India']"
		+ "//following-sibling::div[@class='dropdownDiv']//ul")).size();
  System.out.println("Total Column Count is:" + " "+colcount);
//Count Rows  
  int rowcount=driver.findElements
(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//h3[text()='India']"
		  		+ "//following-sibling::div[@class='dropdownDiv']//ul[1]//li")).size();
		    System.out.println("Total Column Count is:" + " "+rowcount);
//Print the cities in the table
for(int i=1;i<=colcount;i++) 
	{
for(int j=1;j<=rowcount;j++)
{
String Cities=
driver.findElement
(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//h3[text()='India']//following-sibling::div[@class='dropdownDiv']//ul["+i+"]//li["+j+"]"))
.getText();	
System.out.println(Cities);
}
	}
//Select Origin and Destination
driver.findElement(By.xpath("//a[@value='KNU']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='KNU']")).getText());
		driver.findElement(By.xpath("//div[contains(@id,'destinationStation')]//a[@value='MAA']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@id,'destinationStation')]//a[@value='MAA']")).getText());
		driver.close();
	}

}
