package section6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("addce");
		driver.findElement(By.cssSelector("#password")).sendKeys("***");
		driver.findElement(By.xpath("//input[contains(@title,'Sign')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'login_error')]")).getText());
		driver.close();
	}

}
