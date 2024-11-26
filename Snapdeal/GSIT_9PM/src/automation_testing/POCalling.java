package automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class POCalling {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		PageObject p = 	PageFactory.initElements(driver, PageObject.class);
		p.uid.isDisplayed();
		p.uid.isEnabled();
		
		p.uid.sendKeys("manasqa@gmail.com");
		Thread.sleep(1500);
		
		p.pwd.sendKeys("Manas@1234");
		p.loginButton.isDisplayed();
		
		Thread.sleep(1500);
		driver.close();

	}

}
