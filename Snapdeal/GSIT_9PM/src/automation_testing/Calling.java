package automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		PO_ByClass obj = new PO_ByClass();
		
		driver.findElement(obj.uid).sendKeys("manasqa@gmail.com");
		Thread.sleep(1500);
		driver.findElement(obj.pwd).sendKeys("Manan@123");
		Thread.sleep(1500);
		driver.close();

	}

}
