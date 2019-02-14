package com.clare.MuseaTests.BDDCucumber;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	WebDriverWait wait;
	
	@Before
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", Constants.DRIVERLOCATION);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);
	}
	
	@Given("^I navigate to the React Application$")
	public void i_navigate_to_the_React_Application() throws Throwable {
		driver.get(Constants.URLHOME);
	}

	@When("^I click the Museums In the NavBar$")
	public void i_click_the_Museums_In_the_NavBar() throws Throwable {
		HomePage page1 = PageFactory.initElements(driver, HomePage.class);
		page1.navigateToMusuemPage();
	}

	@When("^I click the searchBar$")
	public void i_click_the_searchBar() throws Throwable {
		MusuemPage page2 = PageFactory.initElements(driver, MusuemPage.class);
		page2.clickSearchBar();
	}

	@When("^I enter the \"([^\"]*)\"$")
	public void i_enter_the(String arg1) throws Throwable {
		MusuemPage page3 = PageFactory.initElements(driver, MusuemPage.class);
		page3.enterInfo(arg1);
	}

	@Then("^I should see the contact details for the Museum$")
	public void i_should_see_the_contact_details_for_the_Museum() throws Throwable {
		MusuemPage page4 = PageFactory.initElements(driver, MusuemPage.class);
			
		
		assertEquals("Did not find the details", true ,page4.searchForDetails(wait));
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
	}

	
	
}
