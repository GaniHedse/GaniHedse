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

		driver.get("URL");
		driver.manage().window().maximize();

		System.out.println("Trying To deal the conflic1t");

		
	}

}
