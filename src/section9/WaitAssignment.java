package section9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,5);
// enter url
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
//Explicit Wait
		driver.findElement(By.xpath("//h2[text()='Demo']//following::a")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		System.out.println(driver.findElement(By.id("results")).getText());
	}

}
