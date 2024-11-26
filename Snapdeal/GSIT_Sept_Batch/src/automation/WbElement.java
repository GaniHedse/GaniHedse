package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WbElement {

	public static void main(String[] args)throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement emailAdd =  driver.findElement(By.id("email"));
		WebElement pwd =  driver.findElement(By.id("pass"));
		WebElement loginButton =  driver.findElement(By.name("login"));
		
		System.out.println(emailAdd.isDisplayed());
		System.out.println(emailAdd.isEnabled());
		emailAdd.sendKeys("manasqa@gmail.com");
		emailAdd.clear();
		
		System.out.println(pwd.isDisplayed());
		pwd.sendKeys("Manas@123");
		
		System.out.println(loginButton.isDisplayed());
		
		driver.close();
		
		
	}

}
