package automation_testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ElementSS {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement emailAdd = driver.findElement(By.id("email"));
		WebElement login = driver.findElement(By.name("login"));
		
	   File f = login.getScreenshotAs(OutputType.FILE);
	   Files.copy(f, new File("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\Result\\loginButton.png"));
	   
	   driver.close();
	}

}
