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
		System.out.println("Trying To deal the conflic1t");
		System.out.println("Trying To deal the conflict2");
		System.out.println("Trying To deal the conflict3");
		System.out.println("Trying To deal the conflict4");
		System.out.println("Trying To deal the conflict5");
		
	}

}
