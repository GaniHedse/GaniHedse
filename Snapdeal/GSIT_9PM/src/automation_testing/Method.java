package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {
	WebDriver driver;
	
	//Creating the method to Launch the app
	public void launchApp(String url) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(1500);
	}
	
	//Creating the method to close the Application
	public void closeApp() {
		driver.close();
	}
	
	//Creating the method to check whether the element is Available or not
	public void elementAvailable(String loc, boolean exp) {
	 boolean elementDispaly = driver.findElement(By.id(loc)).isDisplayed();
	 
	 if(elementDispaly ==exp) {
		 System.out.println("Pass");
	 }
	 else {
		System.out.println("Fail");
	}
	}
	
	//Creating the method to check whether the element is Enabled or not
		public void elementEnabled(String loc, boolean exp) {
		 boolean elementClikable = driver.findElement(By.id(loc)).isEnabled();
		 
		 if(elementClikable ==exp) {
			 System.out.println("Pass");
		 }
		 else {
			System.out.println("Fail");
		}
		}
	
	//Creating the method to verify the title
		public void titleContains(String val) {
			
		String appTitle = driver.getTitle();
		
		if(appTitle.contains(val)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println(appTitle);
		}
	

		//Creating the method to verify the URL 
				public void urlContains(String val) {
					
				String appURL = driver.getCurrentUrl();
				
				if(appURL.contains(val)) {
					System.out.println("Pass");
				}
				else {
					System.out.println("Fail");
				}
				System.out.println(appURL);
				}
}
