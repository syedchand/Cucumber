package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUp {
	
	public static WebDriver driver;
	
	@Before
	public void setdriver() {
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@After
	public void closedriver() {
		
		driver.quit();
	}

}
