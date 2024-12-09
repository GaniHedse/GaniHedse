package com.operative.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.operative.utils.BasePage;

public class ProductsUI extends BasePage{
	WebDriver driver;
	public ProductsUI(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	private final By prodyctID=By.xpath("//span[text()='Product ID']");
	private final By Template=By.id("pr_id_19_label");
	private final By LocalLinear=By.xpath("//span[text()='Local Linear']");
	private final By ProductStatus=By.cssSelector("#status_multiselect");
	private final By publishedOptions=By.xpath("//span[text()='Published']");
	private final By Applybutton=By.cssSelector("#apply");
	
	
	
	
	
	
	
	
	
	public void clickOnTemplate()
	{
		safeClick(Template);
		System.out.println(">>>> Clicked on Template Dropdown");
	}
	
	public void clickOnLocalLinear()
	{
		safeClick(LocalLinear);
		System.out.println(">>>>>>> clicked on Local Linear Dropdown");
		
	}
	
	public void clickOnProductStatus()
	{
		safeClick(ProductStatus);
		System.out.println(">>>>>>> Clicked on Product Status Dropdown");
	}
	public void selectPublishedOption()
	{
		safeClick(publishedOptions);
		System.out.println(">>>>>>> Selecting Published Options");
	}
	public void clickOnApply()
	{
		safeClick(Applybutton);
		System.out.println(">>>>>> Clicking on Apply Button");
	}
	
	public void clickOnProductSort()
	{
		safeClick(prodyctID);
		System.out.println(">>>>>> Clicked on ProductID sort");
	}
	
	
	
	

}
