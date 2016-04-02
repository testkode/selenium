package com.expedia.flightsbooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestNGTest {

	@Test
	public void verifyTitle()
	{
	WebDriver driver = new FirefoxDriver();
	driver.get("http://gmail.com");
	String Actual_title = driver.getTitle();
	Assert.assertEquals(Actual_title, "Gmail");
	System.out.println("Gmail browser open test pass");
	driver.quit();

	}
}
