package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.contants.FrameworkContants;
import com.tmb.driver.DriverManager;
import com.tmb.enums.WaitStrategy;

public class BasePage {

	public void click(By by,WaitStrategy waitStrategy) {

		//WaitFactory.performExplicitWait(waitStrategy, by);
		performExplicitWait(waitStrategy, by);
		DriverManager.getDriver().findElement(by).click();
	}

	public void sendKeys(By by,String value,WaitStrategy waitStrategy) {
		//WaitFactory.performExplicitWait(waitStrategy, by);
		performExplicitWait(waitStrategy, by);
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}

	public String getElementText(By by,WaitStrategy waitStrategy) {
		performExplicitWait(waitStrategy, by);
		return DriverManager.getDriver().findElement(by).getText();
	}
	
	public void performExplicitWait(WaitStrategy waitStrategy,By by) {

		if(waitStrategy == WaitStrategy.CLICKABLE) {
			WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameworkContants.getWait());
			wait.until(ExpectedConditions.elementToBeClickable(by));

		}
		else if(waitStrategy == WaitStrategy.PRESENCE) {
			WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameworkContants.getWait());
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		else if(waitStrategy == WaitStrategy.VISIBLE) {
			WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), FrameworkContants.getWait());
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
	}


}






