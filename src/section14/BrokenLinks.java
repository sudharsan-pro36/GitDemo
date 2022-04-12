package section14;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
// Initiate ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//enter url
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a=new SoftAssert();
//to find all links in webelement
		List<WebElement> links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
//Loop
		for(WebElement allLink:links)
		{
		String url=allLink.getAttribute("href");
	HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int responseCode=conn.getResponseCode();
	System.out.println(responseCode);
	a.assertTrue(responseCode<400, "The Linkname,"+"'"+allLink.getText()+"' "+"is broken with Code: "+responseCode);
		}
		
		a.assertAll();
	}

}
