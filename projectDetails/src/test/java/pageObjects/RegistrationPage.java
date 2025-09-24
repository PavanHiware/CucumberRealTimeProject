package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.testContextSetup;

public class RegistrationPage {
	
	
	public WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By firstName = By.xpath("//*[@id='input-firstname']");
	By lastName = By.xpath("//*[@id='input-lastname']");
	By Email = By.xpath("//*[@id='input-email']");
	By telephone = By.xpath("//*[@id='input-telephone']");
	By password = By.xpath("//*[@id='input-password']");
	By confirm_password = By.xpath("//*[@id='input-confirm']");
	By checkBox = By.xpath("//*[@class='buttons']/div/input[1]");
	By continueBtn = By.xpath("//*[@class='buttons']/div/input[2]");
	By confirmMsg = By.xpath("//*[@id='common-success']/div/div/h1");
	By submitBtn = By.xpath("//*[@class='buttons']//a");
	
	
	//Please provide mandatory details
	public void firsatName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
		
	}
	
	//Please provide mandatory details
	public void lastName(String lastname){
		driver.findElement(lastName).sendKeys(lastname);
		
	}
	
	//Please provide mandatory details
	public void email(String email) {
		driver.findElement(Email).sendKeys(email);
		
	}
	
	//Please provide mandatory details
	public void telephone(String tekephoneNo) {
		driver.findElement(telephone).sendKeys(tekephoneNo);
		
	}
	
	//Please provide mandatory details
	public void password(String pass) {
		driver.findElement(password).sendKeys(pass);
		driver.findElement(confirm_password).sendKeys(pass);
	}
	
	public void submitbtn() {
		driver.findElement(checkBox).click();
		driver.findElement(continueBtn).click();
	}
	
	public void confirmMsg() {
		String confirmText=driver.findElement(confirmMsg).getText();
		if (confirmText.equalsIgnoreCase("Your Account Has Been Created!")) {
			System.out.println("User logged successfully.");
		}
		driver.findElement(submitBtn).click();
	}
	
	
}
