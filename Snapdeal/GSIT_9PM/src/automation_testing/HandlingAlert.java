package automation_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(1600);
		
		driver.findElement(By.xpath("//*[@title='Sign in']")).click();
		Thread.sleep(1600);
		
		//Importing Alert
		
		Alert a = driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		//Closing the Alert message
		
		a.dismiss();
		Thread.sleep(1600);
		
		driver.close();
		
		
		
	}

}
