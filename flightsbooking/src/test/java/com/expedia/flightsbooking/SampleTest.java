package com.expedia.flightsbooking;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SampleTest {

	@Test (priority = 1, description = "verify testA")
	public void testA()
	
	{
	  Assert.assertEquals("Google", "Google");	
	  System.out.println("Google is same");	}
	@Test (priority = 2, description ="verify testB", enabled =false)
	public void testB()
	{
		Assert.assertEquals("Gmail", "Google");
	}
	@Test (priority = 3, description = "verify testC")
	public void testC()
	{
		Assert.assertEquals("Gmail", "Gmail");
	}
}


