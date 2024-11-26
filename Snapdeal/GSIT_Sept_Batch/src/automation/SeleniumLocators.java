package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("manasqa04@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("Manas@123");
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("ayanqa@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("Ayan@321");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("login")).click();
		
	}

}
