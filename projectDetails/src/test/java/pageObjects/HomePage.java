package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
	
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	

	private By myAccount = By.xpath("//*[@class='dropdown']/a//span[1]");
	private By registerLink = By.xpath("//*[@class='dropdown open']/ul/li[1]/a");
	private By loginLink = By.xpath("//*[@class='dropdown open']/ul/li[2]/a");
	By searchBox = By.xpath("//*[@id='search']//input");
	By searchicon = By.xpath("//*[@id='search']//span");
	
	public void openMyAccount() {
		driver.findElement(myAccount).click();
	}
	
	public void registerLink()  {
		driver.findElement(registerLink).click();
		
		driver.getTitle();
		
	}
	
	public void loginLink() {
		driver.findElement(loginLink).click();
	}
	public void searchItem(String productName) {
		driver.findElement(searchBox).sendKeys(productName);
		driver.findElement(searchicon).click();
	}
}
