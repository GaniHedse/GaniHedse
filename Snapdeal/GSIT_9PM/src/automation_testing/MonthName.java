package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthName {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select obj = new Select(month);
		List<WebElement> mName =  obj.getOptions();
		
		
		for(WebElement ref : mName) {
			  String val = ref.getText();
			  if(val.contains("Mar")) {
				  System.out.println(val);
			  }
		}
		
		driver.close();
}
}
