package com.tmb.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.util.ReadPropertyFile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {


	private static WebDriver driver=null;

	public static void initDriver() throws Exception {

		if(Objects.isNull(DriverManager.getDriver())) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			DriverManager.setDriver(driver);
			DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
			maximizeWindow();
		}

	}

	public static void quitDriver() {
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.remove();
		}
	}
	
	public static void maximizeWindow() {
		DriverManager.getDriver().manage().window().maximize();
	}
}
