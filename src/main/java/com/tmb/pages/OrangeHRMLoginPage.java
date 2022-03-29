package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textbox_username=By.id("txtUsername");
	private final By textbox_password=By.id("txtPassword");
	private final By button_login=By.id("btnLogin");
	private final By login_panel=By.id("logInPanelHeading");

	public OrangeHRMLoginPage enterUsername(String username) {
		sendKeys(textbox_username, username, WaitStrategy.PRESENCE);
		return this;
	}

	public OrangeHRMLoginPage enterPassword(String password) {
		sendKeys(textbox_password, password, WaitStrategy.PRESENCE);
		return this; // or return new OrangeHRMLoginPage();
	}

	public OrangeHRMHomePage clickLogin() {
		click(button_login, WaitStrategy.CLICKABLE);
		return new OrangeHRMHomePage();
	}

	public String getLoginPanel_Name() {
		return getElementText(login_panel, WaitStrategy.PRESENCE);
	}
}
