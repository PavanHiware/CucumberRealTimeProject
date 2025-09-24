package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgotPasswordPage {
	
	WebDriver driver;
	
	public forgotPasswordPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By emailAddress = By.xpath("//*[@id='input-email']");
	By continueBtn = By.xpath("//*[@class='btn btn-primary']");
	
	public void emailAddress(String emailID) {
		driver.findElement(emailAddress).sendKeys(emailID);
	}
	
	public void continueBtn() {
		driver.findElement(continueBtn).click();
	}
}
