package StepDefinationsCucumberPracticeProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.customerAccountPage;
import pageObjects.loginPage;
import utils.testContextSetup;

public class TC_LF_01 {
	testContextSetup testContextSetup;
	
	public TC_LF_01(testContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	@Given("User is on homepage and opening my account by clicking login")
	public void user_is_on_homepage_and_opening_my_account_by_clicking_login() {
		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		homePage.openMyAccount();
//		homePage.registerLink();
		homePage.loginLink();
		
	}

	@When("^User should enter (.+) address and (.+)$")
	public void user_should_enter_amotoori3_gmail_com_address_and(String email,String Password) {
		loginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
		loginPage.enterEmail(email);
		loginPage.enterpassword(Password);
		
	}

	@When("User should click on login")
	public void user_should_click_on_login() {
		loginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
		loginPage.clickLoginBtn();
	}

	@Then("User should be navigated to login page")
	public void user_should_be_navigated_to_login_page() {
		loginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
//		loginPage.checkValidUser();
	}

	@Then("User should be taken to myAccount page")
	public void user_should_be_taken_to_my_account_page() {
		customerAccountPage customerAccountPage = testContextSetup.pageObjectManager.getCustomerAccountPage();
		customerAccountPage.confirmPage();
	}

}
