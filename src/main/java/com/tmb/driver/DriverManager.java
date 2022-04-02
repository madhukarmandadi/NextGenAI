package com.tmb.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	public static ThreadLocal<WebDriver> dr= new ThreadLocal<>();

	public static void setDriver(WebDriver driverref) {
		System.out.println(dr);
		dr.set(driverref);
		System.out.println(dr);
	}

	public static WebDriver getDriver() {
		return dr.get();
	}

	public static void remove() {
		dr.remove();
	}
}
