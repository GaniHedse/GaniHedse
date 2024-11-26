package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommand {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		boolean emailDispaly = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(emailDispaly);

		boolean pwdDispaly = driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(pwdDispaly);

		boolean emailClickable = driver.findElement(By.id("email")).isEnabled();
		System.out.println(emailClickable);

		
		  boolean loginClickable = driver.findElement(By.name("login")).isEnabled();
		  System.out.println(loginClickable);
		  
		  String appTitle = driver.getTitle();
		  System.out.println("Application Title is: " + appTitle);
		  
		  String appURL = driver.getCurrentUrl();
		  System.out.println("Application URL is: " + appURL);
		 

		if (appTitle.length() > appURL.length()) {
		} else {
			System.out.println("Fail");
		}

		String emailAtt = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(emailAtt);

		String tag = driver.findElement(By.id("email")).getTagName();
		System.out.println(tag);

		Dimension d = driver.findElement(By.id("email")).getSize();
		System.out.println(d);

		String bName = driver.findElement(By.name("login")).getText();
		System.out.println(bName);

		driver.close();
	}

}
