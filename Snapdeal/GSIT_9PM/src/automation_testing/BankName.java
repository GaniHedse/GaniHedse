package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankName {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/sectors/bse/bankex");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement table =  driver.findElement(By.xpath("//*[@class='dataTable']"));
		
		List<WebElement> bName =  table.findElements(By.xpath("//*[@class='dataTable']//tr[2]"));
		
	    for(WebElement ref : bName) {
	    	System.out.print(ref.getText()+"  ");
	    }
	    
	    System.out.println();
	    
	  String icici =  driver.findElement(By.xpath("//*[@class='dataTable']//tr[6]//td[3]")).getText();
	    System.out.println(icici);
	    driver.close();
		
}
}
