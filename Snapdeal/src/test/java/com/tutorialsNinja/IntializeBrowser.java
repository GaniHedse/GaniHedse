package com.tutorialsNinja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IntializeBrowser {
	public static WebDriver driver=null;
	
	@BeforeTest
	public void LaunchBrowser()
	{
		driver=new ChromeDriver();
		
	}

}
