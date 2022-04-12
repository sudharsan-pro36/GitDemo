package section5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsermethods1 {

	public static void main(String[] args) {
		
		browsermethods1 obj=new browsermethods1();
		System.out.println(obj.browsermethods());
	}
		
		public String browsermethods()
		{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Driver\\\\chromeDriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.get("https://www.eclipse.org/");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
return "PASS";
	}

}
