package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetSpeed {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(16000);
		
		WebElement speed = driver.findElement(By.id("speed-value"));
		WebElement sUnit =  driver.findElement(By.id("speed-units"));
		
		System.out.println("Your Internet Speed is: "+speed.getText()+" "+sUnit.getText());
		
		driver.close();

	}

}
