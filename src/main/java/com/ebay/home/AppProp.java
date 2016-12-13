package com.ebay.home;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProp 
{
	static Properties prop=new Properties();
	static {
    	InputStream in=Object.class.getResourceAsStream("/application.properties");
    	try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
