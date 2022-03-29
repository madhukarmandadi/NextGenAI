package com.tmb.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	public static ThreadLocal<WebDriver> dr= new ThreadLocal<WebDriver>();

	public static void setDriver(WebDriver driverref) {
		dr.set(driverref);
	}

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void remove() {
		dr.remove();
	}
}
