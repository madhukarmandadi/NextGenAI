package com.tmb.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.contants.FrameworkContants;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;

public class WaitFactory {

	public static void performExplicitWait(WaitStrategy waitStrategy,By by) {

		if(waitStrategy == WaitStrategy.CLICKABLE) {
			WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameworkContants.getWait());
			wait.until(ExpectedConditions.elementToBeClickable(by));

		}
		else if(waitStrategy == WaitStrategy.PRESENCE) {
			WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameworkContants.getWait());
			wait.until(ExpectedConditions.elementToBeClickable(by));
		}
		else if(waitStrategy == WaitStrategy.VISIBLE) {
			WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameworkContants.getWait());
			wait.until(ExpectedConditions.elementToBeClickable(by));
		}
	}

}
