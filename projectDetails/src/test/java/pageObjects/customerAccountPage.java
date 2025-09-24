package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class customerAccountPage {

	public WebDriver driver;

	public customerAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	private By logoText = By.xpath("//*[@id='logo']//a");

	public void confirmPage() {
		String logotext = driver.findElement(logoText).getText();
		if (logotext.equalsIgnoreCase("Qafox.com")) {
			System.out.println(driver.getTitle());
		}

	}
}
