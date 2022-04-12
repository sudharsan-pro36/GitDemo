package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Runtest_Chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//Chrome Driver
/*System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Driver\\\\chromeDriver\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();*/

//IE Driver
System.setProperty("webdriver.ie.driver","E:\\Selenium Driver\\IEDriver\\IEDriverServer.exe");
WebDriver driver=new InternetExplorerDriver();
driver.get("https://www.google.co.in/");
Thread.sleep(1000);
System.out.println(driver.getTitle());
	}

}
