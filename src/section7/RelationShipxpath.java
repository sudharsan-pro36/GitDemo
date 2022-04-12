package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelationShipxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[text()='Interview Guide']")).click();
		driver.findElement(By.xpath("//div[@class='inner-box']//following::div[contains(text(),'Make a big leap')]")).click();
		driver.findElement(By.xpath("//div/child::input[@name='username']")).sendKeys("abcd");
		driver.close();
	}
	

}
