package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonMethods.CommonMethods;
import com.tutorialsNinja.BaseTest;

public class HomePage extends CommonMethods {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath="//a[text()='Qafox.com']")
	private WebElement Logo;
	
	
	
	
	
	
	
	
	public boolean VerifyingLogo()
	{
		boolean flag=false;
		if(isVisible(Logo))
		{
			flag=true;
			BaseTest.log.info("Logo is Visible");
		}
		else
		{
			flag=false;
			BaseTest.log.info("Logo is Not Visible");
		}
		return flag;
	}
	
	
	
	

}
