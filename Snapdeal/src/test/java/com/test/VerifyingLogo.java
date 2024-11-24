package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.tutorialsNinja.BaseTest;

public class VerifyingLogo extends BaseTest{
	HomePage home;

	@BeforeMethod
	public void LaunchApplication()
	{
		LaunchBrowser();
		openURL();
		StartTestCase("Verifying QAFox Logo is presence");
	}




	@Test
	public void VerifyingLogoPresence()
	{
		home=new HomePage(driver);
		AssertTrue(home.VerifyingLogo());
		log.info("Actual Result for Logo presence is----->"+home.VerifyingLogo());
		
		System.out.println("------");
	}

	@AfterMethod
	public void Close()
	{
		Endbrowsers();
		EndTestCase("Verifying QAFox Logo is presence");
	}

}
