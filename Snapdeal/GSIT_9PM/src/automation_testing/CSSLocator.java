package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		driver.findElement(By.cssSelector("*[name='email']")).sendKeys("manas1234@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("*[name='pass']")).sendKeys("manas1234@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("*[name='login']")).click();
		
		

	}

}
