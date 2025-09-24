package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {

	WebDriver driver;
	
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties pro = new Properties();
		pro.load(file);
		String URL = pro.getProperty("websiteURL");
		
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\2110883\\eclipse-workspace\\CucumberRealTimeProject\\Components\\drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(URL);
			
		}
		return driver;
	}
	}