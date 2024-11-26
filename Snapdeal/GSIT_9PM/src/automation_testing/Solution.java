package automation_testing;

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

		// 1 Application title length should be greater than application URL length

		String appTilte = driver.getTitle();
		String appURL = driver.getCurrentUrl();

		if (appTilte.length() > appURL.length()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		Thread.sleep(1500);

		// 2. Log In button should be available and should be enabled

		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

		boolean loginDisaply = driver.findElement(By.id("loginbutton")).isDisplayed();

		if (loginDisaply == true) {
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

		// 3 Title of the page should not contains “password1”

		driver.findElement(By.className("_97w4")).click();
		Thread.sleep(3000);

		String appTilte2 = driver.getTitle();

		if (appTilte2.contains("password1") != true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// 4 Search Button should be available, and it should be enabled.

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
