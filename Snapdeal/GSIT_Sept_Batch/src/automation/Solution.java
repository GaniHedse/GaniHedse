package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Solution {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		// Application title length should be greater than application URL length

		String appTitle = driver.getTitle();
		String appURL = driver.getCurrentUrl();

		if (appTitle.length() > appURL.length()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);

		// Log In button should be available and should be enabled

		boolean loginDispaly = driver.findElement(By.id("loginbutton")).isDisplayed();

		if (loginDispaly == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		boolean loginEnabled = driver.findElement(By.id("loginbutton")).isEnabled();

		if (loginEnabled == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		driver.findElement(By.className("_97w4")).click();
		Thread.sleep(3500);

		// Title of the page should not contains “password1”

		String AppTtile2 = driver.getTitle();

		if (AppTtile2.contains("password1") != true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// Search Button should be available, and it should be enabled.

		boolean searchDispaly = driver.findElement(By.id("did_submit")).isDisplayed();

		if (searchDispaly == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		boolean searchEnabled = driver.findElement(By.id("did_submit")).isEnabled();

		if (searchEnabled == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		driver.close();

	}

}
