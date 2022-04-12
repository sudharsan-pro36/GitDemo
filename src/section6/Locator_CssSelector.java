package section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#username")).sendKeys("username");
		driver.findElement(By.cssSelector("[name='pw']")).sendKeys("password");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.manage().window().maximize();
		String experror="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		System.out.println(experror);
		String Actualerror=driver.findElement(By.id("error")).getText();
		System.out.println(Actualerror);
		if(Actualerror.equalsIgnoreCase(experror))
		{
			System.out.println("above Text Matches:");
		}
		else
		{
			System.out.println("Not Matching");
		}
		driver.get("https://www.goindigo.in/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("input#memberId")).sendKeys("1212");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("wjss");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.close();
	
	}

}
