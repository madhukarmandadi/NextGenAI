package com.tmb.testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMHomePage;
import com.tmb.pages.OrangeHRMLoginPage;
import com.tmb.util.TestDataProvider;

public class OrangeHRMTest extends Base {
	OrangeHRMLoginPage loginPage=new OrangeHRMLoginPage();
	
	
	@Test(dataProvider = "getExcelData", dataProviderClass = TestDataProvider.class)
	public void logoutTest(Map<String, String> map) throws Exception {
		
		OrangeHRMHomePage homePage = loginPage.enterUsername(map.get("username")).enterPassword(map.get("password")).clickLogin();
		String loginPanelName=homePage.clickWelcome().clickLogout().getLoginPanel_Name();
		Assert.assertEquals(loginPanelName, "LOGIN Panel");
	}
}