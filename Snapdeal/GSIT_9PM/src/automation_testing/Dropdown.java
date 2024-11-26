package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement day =  driver.findElement(By.id("day"));
		
		Select obj1 = new Select(day);
		obj1.selectByValue("1");
		Thread.sleep(1500);
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select obj2 = new Select(month);
		obj2.selectByIndex(0);
		
		Thread.sleep(1500);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select obj3 = new Select(year);
		obj3.selectByVisibleText("1995");
		
		boolean res =  obj3.isMultiple();
		System.out.println(res);
		
		
		
		Thread.sleep(3000);
		driver.close();
		
}
}
