package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("email")).sendKeys("manasqa04@gmail.com");


		driver.findElement(By.id("pass")).sendKeys("Manas@123");

		
		driver.findElement(By.id("email")).clear();
		

		driver.findElement(By.id("pass")).clear();
		
		driver.findElement(By.id("email")).sendKeys("ashis_qa04@gmail.com");
		

		driver.findElement(By.id("pass")).sendKeys("Ashish@123");
		
		driver.findElement(By.name("login")).click();
		
	}

}
