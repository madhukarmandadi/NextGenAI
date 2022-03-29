package com.tmb.contants;

// when we declare final no other class will be able extend this class.
public final class FrameworkContants {

	// when we create private constructor no class will be able to create object of
	// FrameworkContants class.
	private FrameworkContants() {

	}
    
	private static final String CHROME_DRIVER_PATH = "//";

	public static String getChromeDriverPath() {
		return CHROME_DRIVER_PATH;
	}

	private static final String CONFIG_FILE_PATH = "./src/test/resources/configuration//config.properties";

	public static String getConfigFilePath() {
		return CONFIG_FILE_PATH;
	}

	private static final String CONFIG_FILE_PATH2 = "./src/test/resources/configuration//config2.properties";

	public static String getConfigFilePath2() {
		return CONFIG_FILE_PATH2;
	}
	
	public static int getWait() {
		return WAIT;
	}

	private static final int WAIT = 10;
}
