package section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Driver\\\\chromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("enter username");
		driver.findElement(By.name("password")).sendKeys("enter password");
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		//driver.quit();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.name("pw")).sendKeys("username");
		
}
}