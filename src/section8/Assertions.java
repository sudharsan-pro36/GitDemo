package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//launch url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

//Verify Checkbox is selected or not using Assertion
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());

//click Checbox
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();

//Verify Checkbox is selected or not using Assertion
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());

//Get size
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.close();

	}

}
