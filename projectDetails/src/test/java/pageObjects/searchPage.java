package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class searchPage {
	WebDriver driver;
	public searchPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By productAvability = By.xpath("//*[@class='product-thumb']");
	By productNameCheck = By.xpath("//*[@class='product-thumb']/div/div/h4/a");
	By productNotAvailabelMsg = By.xpath("//*[@id='content']/p[2]");
	
	
	public void productCheck(String productName) {
		WebElement productAvalibilty = driver.findElement(productAvability);
		String productNameShow = driver.findElement(productNameCheck).getText();
		
		if (productAvalibilty.isDisplayed()) {
			Assert.assertEquals(productNameShow, productName);
		}
		else if (driver.findElement(productNotAvailabelMsg).isDisplayed()) {
			System.out.println("Sorry.. "+productName+" is not available");
			System.out.println(driver.findElement(productNotAvailabelMsg).getText());
		} 
		
		
		
		
	}
}
