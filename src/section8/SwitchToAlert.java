package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String Name="Sudharsan Ranganathan";
//launch url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//enter name
driver.findElement(By.cssSelector("#name")).sendKeys(Name);

//ClickAlert Button
driver.findElement(By.cssSelector("#alertbtn")).click();

//Switchto Alert and print the text
String ExpectedText="Hello Sudharsan Ranganathan, share this practice page and share your knowledge";
String ActualText=driver.switchTo().alert().getText();
if(ActualText.equalsIgnoreCase(ExpectedText))
{
	System.out.println(ActualText+":"+" Text Matching");
}
driver.switchTo().alert().accept();

//Click ConfirmButton
driver.findElement(By.cssSelector("#confirmbtn")).click();

//Switch to Alert and dismiss
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().dismiss();
driver.close();
	}
}
