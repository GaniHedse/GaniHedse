package com.tutorialsNinja;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

import com.commonMethods.AssertionsMethods;

public class BaseTest extends AssertionsMethods{
	public static WebDriver driver=null;
	Properties prop;
	public  static Logger log=LogManager.getLogger(BaseTest.class);

	
	public void LaunchBrowser()
	{
		try
		{
			prop=new Properties();
			File file=new File("./Resource/Automation.properties");
			FileInputStream fin=new FileInputStream(file);
			prop.load(fin);
			String browser =  prop.getProperty("Browser");
			if(browser.equalsIgnoreCase("chrome"))
			{
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--disable-notifictions");
				option.addArguments("Incognito");
				driver=new ChromeDriver(option);
				log.info(browser+ " Launched Succesfully");


			}
			else if(browser.equalsIgnoreCase("Edge"))
			{
				driver=new EdgeDriver();
				log.info(browser+ " Launched Succesfully");
			}
			else
			{
				log.info("Choose either Chrome or Edge Browser");
			}


		}catch( Exception e)
		{
			e.printStackTrace();
		}
	}
	public void StartTestCase(String TestCaseName)
	{
		log.info("=================================================");
		log.info(">>>>>>>>>>>>>>>"+TestCaseName+" Started <<<<<<<<<<<<<<<<<<");
	}
	public void EndTestCase(String TestCaseName)
	{
		log.info("=================================================");
		log.info(">>>>>>>>>>>>>>>"+TestCaseName+" Ended <<<<<<<<<<<<<<<<<<");
	}

	public void openURL()
	{
		String url=prop.getProperty("URL");
		driver.navigate().to(url);
		log.info("Navigating to >>>>>"+ url);
		driver.manage().window().maximize();


	}
	public void Endbrowsers()
	{
		driver.quit();
	}

}
