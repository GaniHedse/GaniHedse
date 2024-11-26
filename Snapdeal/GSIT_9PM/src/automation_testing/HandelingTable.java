package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingTable {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement table =  driver.findElement(By.xpath("//*[@class='dataTable']"));
		
	    List<WebElement> tr =	table.findElements(By.tagName("tr"));  
	    System.out.println("Number of Rows are "+tr.size());
	    
	    List<WebElement> tc =	table.findElements(By.tagName("th"));  
	    System.out.println("Number of Columns are "+tc.size());
	    
	    List<WebElement> td =	table.findElements(By.tagName("td"));  
	    System.out.println("Number of Data are "+td.size());
	    
	    
	    
	    driver.close();
		
		
	}

}
