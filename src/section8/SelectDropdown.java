package section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Currencyfield=driver.findElement(By.xpath("//select[contains(@id,'DropDownListCurrency')]"));
		Select CurrencyDropdown=new Select(Currencyfield);
		CurrencyDropdown.selectByIndex(2);
		System.out.println(CurrencyDropdown.getFirstSelectedOption().getText());
		CurrencyDropdown.selectByVisibleText("USD");
		System.out.println(CurrencyDropdown.getFirstSelectedOption().getText());
		CurrencyDropdown.selectByValue("INR");
		System.out.println(CurrencyDropdown.getFirstSelectedOption().getText());
		driver.close();
	}

}
