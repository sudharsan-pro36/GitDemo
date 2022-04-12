package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//launch url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(5000);


//click Checkbox
driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();


//Verify Checkbox is selected or not using Assertion
Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());

//click Checkbox
driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();


//Verify Checkbox is selected or not using Assertion
Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());

//Get size
System.out.println(driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']")).size());
driver.close();

	}

	}