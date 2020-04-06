package com.runner.test;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C://Users//nehaashokj//eclipse-workspace//companysearch//src//main//java//feature//company.feature",
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},//extent report
		glue ={"com.stepdefinition.test"},
		format = {"pretty","html:html_ouput/cucumber.html","json:json_output/cucumber.json"},
		monochrome = true,
		strict = true,
		dryRun =false
		)

public class Runner {

	 @AfterClass
	 public static void writeExtentReport() throws IOException {
	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	 }
	
}
//C:\Users\nehaashokj\git\Mav_Project\practice\src\main\java\feature\form.feature