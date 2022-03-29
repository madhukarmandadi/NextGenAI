package com.tmb.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.tmb.contants.FrameworkContants;

public class ReadPropertyFile3 {

	private static  Properties property= new Properties();
	private static final Map<String, String> CONFIGMAP=new Hashtable<String, String>();
	
	static {
		File file=new File(FrameworkContants.getConfigFilePath());
		try {
			FileInputStream fis=new FileInputStream(file);
			property.load(fis);
			
			
			for (Map.Entry<Object, Object> entry: property.entrySet()) {

				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
			}
			
			//property.entrySet().forEach(entry->CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static String get(String key) throws Exception {
		
		if(Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {

			throw new Exception("property name:" + key + " not found. please refer config.properties file");
		}

		return CONFIGMAP.get(key);


	}
	public static String getValue(String key) throws Exception {

		if(Objects.isNull(property.getProperty(key)) || Objects.isNull(key)) {

			throw new Exception("property name:" + key + " not found. please refer config.properties file");
		}

		return property.getProperty(key);


	}

}
