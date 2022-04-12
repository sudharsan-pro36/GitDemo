package section11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Initiate ChromeDriver
						System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						//WebDriverWait wait=new WebDriverWait(driver,5);
// enter url
						driver.get("https://www.amazon.com/");
						driver.manage().window().maximize();
						Actions moveto= new Actions(driver);
						WebElement signin=driver.findElement(By.cssSelector("a#nav-link-accountList"));
						moveto.moveToElement(signin).build().perform();
	}

}
