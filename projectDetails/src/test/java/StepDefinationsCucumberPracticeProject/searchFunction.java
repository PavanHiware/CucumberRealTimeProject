package StepDefinationsCucumberPracticeProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.searchPage;
import utils.testContextSetup;

public class searchFunction {
	testContextSetup testContextSetup;
	public searchFunction(testContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

@Given("User should be on home page")
public void user_should_be_on_home_page() {
    System.out.println("User is on the home page");
}
@When("^User should be able to enter (.+) and search$")
public void user_should_be_able_to_enter_i_mac_and_search(String productName) {
	HomePage homePage = testContextSetup.pageObjectManager.getHomePage();
    homePage.searchItem(productName);
}
@Then("^User should be able to view correct (.+)$")
public void user_should_be_able_to_view_correct_i_mac(String productName) {
    searchPage searchPage =  testContextSetup.pageObjectManager.getSearchPage();
    searchPage.productCheck(productName);
}
}
