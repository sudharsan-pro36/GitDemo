package section12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class CaptureTextAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Initiate ChromeDriver
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.manage().window().maximize();

				
//grab value of option
				driver.findElement(By.cssSelector("#checkBoxOption1")).click();
				String optionvalue=driver.findElement(By.xpath("//label[@for='benz']")).getText();
				System.out.println(optionvalue);
				
				
//select the option checked from dropdown
				
				WebElement clickdd = driver.findElement(By.id("dropdown-class-example"));
				Select dd=new Select(clickdd);
				dd.selectByVisibleText(optionvalue);
//sendkey the option
				driver.findElement(By.name("enter-name")).sendKeys(optionvalue);
				driver.findElement(By.cssSelector("#alertbtn")).click();

//Swwitch to Alert
				
			String Alerttext=driver.switchTo().alert().getText();
			System.out.println(Alerttext);
			if(Alerttext.contains(optionvalue))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
				
				
				
	}

}
