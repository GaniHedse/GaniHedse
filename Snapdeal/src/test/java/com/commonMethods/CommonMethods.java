package com.commonMethods;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
	WebDriver driver;
	public CommonMethods(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public boolean isVisible(WebElement Element)
	{
		return Element.isDisplayed();
		
	}
	
	

}
