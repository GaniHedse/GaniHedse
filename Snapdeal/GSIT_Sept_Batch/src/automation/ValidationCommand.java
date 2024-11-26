package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommand {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		boolean emailDisaply = driver.findElement(By.id("email")).isDisplayed();
		boolean pwdDisaply = driver.findElement(By.id("pass")).isDisplayed();
		
		System.out.println(emailDisaply);
        System.out.println(pwdDisaply);	
        
        boolean emailClickable = driver.findElement(By.id("email")).isEnabled();
		boolean pwdClickable  =  driver.findElement(By.id("pass")).isEnabled();
		
		System.out.println(emailClickable);
		System.out.println(pwdClickable);
		
		String appTitle = driver.getTitle();
		System.out.println("Application Title is: "+appTitle);
		
		String appURL = driver.getCurrentUrl();
        System.out.println("Application URL is: "+appURL);
        
        String att = driver.findElement(By.id("pass")).getAttribute("placeholder");
        System.out.println(att);
		
        String tagName = driver.findElement(By.id("pass")).getTagName();
        System.out.println(tagName);
        
        Dimension d = driver.findElement(By.id("pass")).getSize();
        System.out.println(d);
        
        String bName = driver.findElement(By.name("login")).getText();
        
        System.out.println(bName);
        
        if(emailDisaply==true && emailClickable==true) {
        	System.out.println("Pass");
        }
        else {
			System.out.println("Fail");
		}
		
        driver.close();
		
	}

}
