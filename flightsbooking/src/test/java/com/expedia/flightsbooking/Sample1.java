package com.expedia.flightsbooking;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample1 {
  @BeforeMethod
  public void Login() {
  
	  System.out.println("Login Successful");
  }
  @AfterMethod
  public void Logout() {
  
	  System.out.println("Logout Successful");
  }
  @Test (priority = 2, groups = {"FundTranserSameBank"})
  public void FundTransferWithinSameBank() {
	  System.out.println("Test runs third because priority is set to 2");
	  System.out.println("Fund Transfer with in same bank Successful");
  }
  @Test (priority = 3, groups = {"FundTranserDifferentBank"})
  public void FundTransferDifferentBank() {
	  System.out.println("Test runs fourth because priority is set to 3");
	  System.out.println("Fund Transfer in different bank Successful");
  }
  @Test (priority = 0, enabled=true)
  public void BillPayments() {
  
	    System.out.println("Bill payment test runs first because priority is set to 0");
	    System.out.println("Bill Payment Successful");
  }
  
  @Test (priority = 1, enabled = true)
  public void BillSuccess(){
	System.out.println("This runs at second because priority is set to 1");
	
  }
}
