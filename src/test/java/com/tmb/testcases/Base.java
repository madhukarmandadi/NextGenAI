package com.tmb.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tmb.driver.Driver;

public class Base {
	
	@BeforeMethod
	public void openBrowser() throws Exception {
		Driver.initDriver();
	}
	
	@AfterMethod
	public void closeBrowser() {
		Driver.quitDriver();
	}

}
