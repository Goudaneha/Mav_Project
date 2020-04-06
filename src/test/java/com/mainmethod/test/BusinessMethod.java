package com.mainmethod.test;

import org.openqa.selenium.WebDriver;
import com.utility.test.BrowserConfig;

public class BusinessMethod extends BrowserConfig  {

private static WebDriver driver;
	
	public static void browsersetup() {
		 driver=browsername("gecko"); 
	}
	
	public static WebDriver getobject() {
		return driver;	
	}
	
	
}
