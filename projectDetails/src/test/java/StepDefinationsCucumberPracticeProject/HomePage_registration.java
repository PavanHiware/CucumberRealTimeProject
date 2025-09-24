package StepDefinationsCucumberPracticeProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import pageObjects.customerAccountPage;
import utils.testContextSetup;

public class HomePage_registration {

	testContextSetup testContextSetup;

	public HomePage_registration(testContextSetup testContextSet) {
		this.testContextSetup = testContextSet;
	}

	@Given("User is on homepage and clicking on my account")
	public void user_is_on_homepage_and_clicking_on_my_account() throws InterruptedException {

		HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
		homePage.openMyAccount();
		homePage.registerLink();
	}

	@When("User should register by providing first name {string} and last name {string} in mandatory fields")
	public void user_should_register_by_providing_first_name_and_last_name_in_mandatory_fields(String firstName,
			String lastName) throws InterruptedException {
		RegistrationPage registrationPage = testContextSetup.pageObjectManager.getRegistrationPage();
		registrationPage.firsatName(firstName);
		registrationPage.lastName(lastName);
	}

	@When("User should add email {string} and telephone no {string}")
	public void user_should_add_email_and_telephone_no(String email, String telephone) {
		RegistrationPage registrationPage = testContextSetup.pageObjectManager.getRegistrationPage();
		registrationPage.email(email);
		registrationPage.telephone(telephone);
	}

	@When("User should provide password {string} and reconfirm it.")
	public void user_should_provide_password_and_reconfirm_it(String password) {
		RegistrationPage registrationPage = testContextSetup.pageObjectManager.getRegistrationPage();
		registrationPage.password(password);
		registrationPage.submitbtn();

	}

	@Then("User should be logged in to account success page")
	public void user_should_be_logged_in_to_account_success_page() throws InterruptedException {
		RegistrationPage registrationPage = testContextSetup.pageObjectManager.getRegistrationPage();
		registrationPage.confirmMsg();
		Thread.sleep(2000);
	}

	@Then("User should confirm email registerd")
	public void user_should_confirm_email_registerd() throws InterruptedException {
		customerAccountPage customerAccountPage = testContextSetup.pageObjectManager.getCustomerAccountPage();
		customerAccountPage.confirmPage();
		
		
	}

}
