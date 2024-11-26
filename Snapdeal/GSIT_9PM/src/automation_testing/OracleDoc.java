package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleDoc {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement f1 =  driver.findElement(By.name("packageListFrame"));
		WebElement f2 =  driver.findElement(By.name("packageFrame"));
		
		List<WebElement>  linkCount = driver.switchTo().frame(f2).findElements(By.tagName("a"));
				
		//driver.switchTo().frame(f1).findElement(By.xpath("//*[@href='java/awt/package-frame.html']")).click();

	    System.out.println(linkCount.size());
	    
	    driver.close();
	}

}
