package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public class OrangeHRMHomePage extends BasePage {

	private final By link_welcome=By.id("welcome");
	private final By link_logout=By.linkText("Logout");
	
	public OrangeHRMHomePage clickWelcome() {
		click(link_welcome, WaitStrategy.CLICKABLE);
		return this;
	}
	
	public OrangeHRMLoginPage clickLogout() {
		click(link_logout, WaitStrategy.CLICKABLE);
		return new OrangeHRMLoginPage();
	}
	
}
