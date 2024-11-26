package automation_testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImgCount {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");

		driver.manage().window().maximize();
		Thread.sleep(2500);
		
		List<WebElement> img = driver.findElements(By.tagName("img"));
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of Images are: "+img.size());
		System.out.println("Number of links are: "+link.size());
		
		if(link.size() > img.size()) {
			System.out.println("Number of Links are Greater");
		}
		else {
			System.out.println("Number of Images are Greater");
		}
		
		driver.close();
}
}
