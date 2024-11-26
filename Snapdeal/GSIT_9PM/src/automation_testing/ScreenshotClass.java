package automation_testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotClass {
	public static WebDriver driver;
	
	public static void screenshot() throws Exception {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\Result\\"+driver.getTitle()+".png"));
		
	}

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		screenshot();
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		
        Thread.sleep(2000);
		
		screenshot();
		
		driver.close();
		

	}

}
