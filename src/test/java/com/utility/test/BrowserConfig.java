package com.utility.test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserConfig {

	private static WebDriver driver;
	
	public static WebDriver browsername(String browser) {
		if(browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver","D://geckodriver-v0.26.0-win64//geckodriver.exe");
			driver = new FirefoxDriver();	
			}
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","‪D://chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Screenshot screenshot = new AShot().takeScreenshot(driver);
		driver.get("https://www.google.com/");
		return driver;
		}
}
