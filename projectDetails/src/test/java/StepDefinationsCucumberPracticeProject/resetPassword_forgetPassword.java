package StepDefinationsCucumberPracticeProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.forgotPasswordPage;
import pageObjects.loginPage;
import utils.testContextSetup;

public class resetPassword_forgetPassword {

	testContextSetup testContextSetup;

	public resetPassword_forgetPassword(testContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Given("User should open applicaton and nevigated to login page")
	public void user_should_open_applicaton_and_nevigated_to_login_page() {
		HomePage homepage = testContextSetup.pageObjectManager.getHomePage();
		homepage.openMyAccount();
		homepage.loginLink();
	}

	@When("^User should able to provide (.+) on password change page by clicking on forgot password link$")
	public void user_should_able_to_provide_email_on_password_change_page_by_clicking_on_forgot_password_link(
			String email) {
		loginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
		loginPage.forgotPasswordLink();

		forgotPasswordPage forgotPasswordPage = testContextSetup.pageObjectManager.getForgotPassword();
		forgotPasswordPage.emailAddress(email);
		forgotPasswordPage.continueBtn();
	}

	@When("User should receive email and confirm password change process")
	public void user_should_receive_email_and_confirm_password_change_process() {
		loginPage loginPage = testContextSetup.pageObjectManager.getLoginPage();
		loginPage.passwordChangeMsg();
	}

	@When("User should provid new password")
	public void user_should_provid_new_password() {
		
	}

	@Then("User should able to reset password")
	public void user_should_able_to_reset_password() {
		
	}

	@Then("User should be able to login with new password")
	public void user_should_be_able_to_login_with_new_password() {
		
	}
}
