package pageObjects;

import org.openqa.selenium.WebDriver;

import utils.testContextSetup;

public class pageObjectManager {
	WebDriver driver;
	public HomePage homepage;
	public loginPage loginPage;
	public RegistrationPage registrationPage;
	public searchPage searchPage;
	public testContextSetup testContextSetup;
	public forgotPasswordPage forgotPasswordPage;
	public customerAccountPage customerAccountPage;
	
	public pageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public HomePage getHomePage() {
		homepage = new HomePage(driver);
		return homepage;
		
	}
	
	public RegistrationPage getRegistrationPage() {
		registrationPage = new RegistrationPage(driver);
		return registrationPage;
		
	}
	
	public customerAccountPage getCustomerAccountPage() {
		customerAccountPage = new customerAccountPage(driver);
		return customerAccountPage;
	}
	public loginPage getLoginPage() {
		loginPage = new loginPage(driver);
		return loginPage;
	}
	public forgotPasswordPage getForgotPassword() {
		forgotPasswordPage = new forgotPasswordPage(driver);
		return forgotPasswordPage;
	}
	public searchPage getSearchPage() {
		searchPage = new searchPage(driver);
		return searchPage;
	}
}
