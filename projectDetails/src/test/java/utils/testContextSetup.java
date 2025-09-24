package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.pageObjectManager;

public class testContextSetup {

	public WebDriver driver;
	public String registrationPage;
	public String HomePage;
	public pageObjectManager pageObjectManager;
	public testBase testBase;
	
	public testContextSetup() throws IOException {
		testBase = new testBase();
		pageObjectManager = new pageObjectManager(testBase.webDriverManager());
		
				}
	
}
