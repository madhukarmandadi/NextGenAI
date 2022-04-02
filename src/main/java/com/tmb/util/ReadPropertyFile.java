package com.tmb.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

import com.tmb.contants.FrameworkContants;

public class ReadPropertyFile {

	private static  Properties property= new Properties();
	
	public static String getValue(String key) throws Exception {
		String value="";
		File file=new File(FrameworkContants.getConfigFilePath());
		FileInputStream fis=new FileInputStream(file);
		property.load(fis);
		value=property.getProperty(key);
		System.out.println("value:"+value);

		if(Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {

			throw new Exception("property name:" + key + " not found. please refer config.properties file"); }

		return value;

	}

}
