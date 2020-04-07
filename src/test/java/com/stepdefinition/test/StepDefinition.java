package com.stepdefinition.test;

import java.awt.AWTException;
import com.mainmethod.test.BusinessMethod;
import com.pageobjects.test.PageObjects;
import com.utility.test.BrowserConfig;
import com.utility.test.CommonMethods;
import com.utility.test.JiraPolicy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class StepDefinition  {

	@Given("^user is on search page \"([^\"]*)\"$")
	public void user_is_on_search_page(String arg1) {
		BusinessMethod.browsersetup();
	}
	
	@JiraPolicy(logTicketReady = true)
	@When("^user enters valid \"([^\"]*)\"$")
	public void user_enters_valid(String company) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		CommonMethods.sendmethod(PageObjects.searchbox, company);
		Assert.assertEquals(company, "maveric systems");
		System.out.println("Test case pass");
	}
	
	@Then("^user clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String arg1) throws InterruptedException, AWTException {
		Thread.sleep(2000);
		CommonMethods.check();
	}
	@Then("^user navigates to \"([^\"]*)\"$")
	public void user_navigates_to(String arg1) throws InterruptedException {
		Thread.sleep(2000);
		BusinessMethod.getobject().close();
	}
	
//	@Given("^user is on searchpage$")
//	public void user_is_on_searchpage() {
//		//BusinessMethod.browsersetup();
//	}
//	
//	@When("^user enters invalid \"([^\"]*)\"$")
//	public void user_enters_invalid(String arg1) {
//		
//	}
//	
//	@Then("^user clicks on \"([^\"]*)\"$")
//	public void user_clicks_on(String arg1) {
//		
//	}
//	
//	@Then("^navigates to \"([^\"]*)\"$")
//	public void navigates_to(String arg1) {
//		
//	}
	}
