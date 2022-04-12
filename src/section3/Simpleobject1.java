package section3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Simpleobject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver","E:\\Selenium Driver\\IEDriver\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		
		Simplemethod1 obj1=new Simplemethod1();
		System.out.println(obj1.method1());
	}

}
