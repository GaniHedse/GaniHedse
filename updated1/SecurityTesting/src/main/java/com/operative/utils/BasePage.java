package com.operative.utils;

import java.time.Duration;
import com.operative.utils.Log;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver=null;
	
	
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebDriver getWebdriver() {
		return driver;
	}

	public Actions getActions() {
		return new Actions(this.driver);
	}
	public void Type(By element, String Text)
	{
		driver.findElement(element).sendKeys(Text);
		Log.info(Text+"   -->Entered");
		
	}
	public void click(By element)
	{
		driver.findElement(element).click();
		
	}
	public void clear(By element)
	{
		driver.findElement(element).clear();
	}
	public String getText(By element)
	{
		
		return driver.findElement(element).getText();
	}
	public String getAttribute(By element , String Attribute)
	{
		return driver.findElement(element).getAttribute(Attribute);
	}
	public List<WebElement> getElements(By element)
	{
		return driver.findElements(element);
	}
	public void moveMouseHere(By element)
	{
		final Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(element)).perform();
	}
	public void safeClick(By locator) {
		try {
			final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			driver.findElement(locator).click();
		} catch (final Exception e) {
			final Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(locator)).perform();
			action.click().perform();
		}
	}

	public void safeType(By locator, String value) {
		final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(value);
	}

	public void safeClear(By locator) {
		final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		driver.findElement(locator).clear();
	}

	public void safeCheck(By locator) {
		if (driver.findElement(locator).getAttribute("checked") == null) {
			driver.findElement(locator).click();
		}
	}

	public void safeUnCheck(By locator) {
		if (driver.findElement(locator).getAttribute("checked") == null) {
		} else {
			driver.findElement(locator).click();
		}
	}

	public void doubleClick(WebElement web) {
		getActions().doubleClick(web).build().perform();
		

	}

	public void doubleClick(By locator) {
		getActions().doubleClick(driver.findElement(locator)).build().perform();
		

	}

}
