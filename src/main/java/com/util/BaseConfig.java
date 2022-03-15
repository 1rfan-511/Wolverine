package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig {
	
	public static String readPro(String value) throws Throwable {
		String path = "./Properties/config.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(fis);
		
		return pro.getProperty(value).toString();
	}
	
}
