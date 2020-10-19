package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDef{
	
	public WebDriver driver = SetUp.driver;
	
	@Given("^User has launched the banking website$")
    public void user_has_launched_the_banking_website() throws Throwable {
       
		
		driver.navigate().to("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    }

    @When("^User Enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something_and_something(String username, String password) throws Throwable {
       
    	System.out.println("Inside Test");
		LoginPage objLogin = new LoginPage(driver);		
		objLogin.login(username, password);
		
    }

    @Then("^User \"([^\"]*)\" should be landing to Home Page$")
    public void user_should_be_landing_to_home_page(String username) throws Throwable {
    	
    	HomePage objHome = new HomePage(driver);
    	objHome.validateDashboardUserName(username);
        
    }

}
