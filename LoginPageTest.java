package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test (groups = {"smoke","p"})
	 public void verifyLoginBtn() {
     login.clickLoginBtn();
	 }
     
	
	
     
}
