package section21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prpty=new Properties();
FileInputStream FIS=new FileInputStream("E:\\Eclipse\\Udemy2021_Selenium\\src\\section21\\Data.properties");
prpty.load(FIS);
System.out.println(prpty.getProperty("Browser"));
System.out.println(prpty.getProperty("url"));
prpty.setProperty("Browser", "firefox");
System.out.println(prpty.getProperty("Browser"));
FileOutputStream FOS=new FileOutputStream("E:\\Eclipse\\Udemy2021_Selenium\\src\\section21\\Data.properties");
prpty.store(FOS, null);
	}

}
