package com.utility.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public String getReportConfigPath() throws IOException{
		FileInputStream fip = new FileInputStream("C://Users//nehaashokj//eclipse-workspace//CompanyName//config//Configuration.properties");
		Properties prop = new Properties();
		prop.load(fip);
		String reportConfigPath = prop.getProperty("reportcinfigpath");
		if(reportConfigPath!= null)
			return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
