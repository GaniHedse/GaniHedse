package automation_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2500); //Explicit Wait
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //Implicit Wait

		driver.findElement(By.id("email")).sendKeys("manasqa04@gmail.com");	
		driver.findElement(By.id("pass")).sendKeys("manasqa04@gmail.com");
		
		WebDriverWait w = new WebDriverWait(driver, 5); //Webdriver wait
		
		System.out.println(driver.getTitle());
		
		w.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("a"), 50));
		w.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("button"), 5));
		w.until(ExpectedConditions.titleContains("Facebook"));
		
		w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		
		
		driver.close();

	}

}
