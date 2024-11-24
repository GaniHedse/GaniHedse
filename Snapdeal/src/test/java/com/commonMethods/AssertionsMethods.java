package com.commonMethods;

import org.testng.asserts.SoftAssert;

public class AssertionsMethods {
	public SoftAssert soft;
	
	public void AssertTrue(boolean Condition)
	{
		 soft=new SoftAssert();
		soft.assertTrue(Condition);
		
		
	}
	public void AssertAll()
	{
		soft.assertAll();
	}

}
