package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbelelmentClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement emailAdd =  driver.findElement(By.id("email"));
		WebElement pwd =  driver.findElement(By.id("pass"));
		WebElement loginButton =  driver.findElement(By.name("login"));
		
		System.out.println(emailAdd.isDisplayed());
		System.out.println(emailAdd.isEnabled());
		
		emailAdd.sendKeys("manasqa04@mgail.com");
		
		System.out.println(pwd.isDisplayed());
		System.out.println(pwd.isEnabled());
		System.out.println(loginButton.isEnabled());
		
		pwd.sendKeys("Manas@123");
		emailAdd.clear();
		
		loginButton.click();
		
		
		

	}

}
