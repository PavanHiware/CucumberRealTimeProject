package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginPage {
	WebDriver driver;

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	By emailid = By.xpath("//*[@id='input-email']");
	By passid = By.xpath("//*[@id='input-password']");
	By loginBTN = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	By logo = By.xpath("//*[@id='logo']");
	By warningMsg = By.xpath("//*[@class='alert alert-danger alert-dismissible']");
	By forgotPasswordLink = By.xpath("//*[@class='col-sm-6']/div/form/div[2]/a");
	By confermationMSGpasswordChange =  By.xpath("//*[@class='alert alert-success alert-dismissible']");

	public void enterEmail(String email) {
		driver.findElement(emailid).sendKeys(email);
	}

	public void enterpassword(String pass) {
		driver.findElement(passid).sendKeys(pass);
	}

	public void clickLoginBtn() {
		driver.findElement(loginBTN).click();
	}

	public void checkValidUser() {
		if (driver.findElement(logo).isDisplayed()) {
			
			System.out.println("User is valid to login.");
			
		}
		else {
			String errorMsg = driver.findElement(warningMsg).getText();
			if (errorMsg.equalsIgnoreCase("Warning: No match for E-Mail Address and/or Password.")) {
				System.out.println("User is invalid to login.");
			} 
		}
	}
	
	public void forgotPasswordLink() {
		driver.findElement(forgotPasswordLink).click();
	}
	
	public void passwordChangeMsg() {
		String confirmMSG = driver.findElement(confermationMSGpasswordChange).getText();
		Assert.assertEquals(confirmMSG, "An email with a confirmation link has been sent your email address.");
	}
	

}
