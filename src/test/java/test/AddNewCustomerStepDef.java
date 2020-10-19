package test;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreateCustomerPage;


public class AddNewCustomerStepDef{
	
	public WebDriver driver = SetUp.driver;
	
	@When("^User clicks on Add New Customer$")
    public void user_clciks_on_add_new_customer() throws Throwable {
		
    }

    @When("^User Enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_something(String customername, String gender, String dateofbirth, String address, String city, String state, String pin, String mobilenumber, String email, String password) throws Throwable {
    	CreateCustomerPage objCust = new CreateCustomerPage(driver);
    	objCust.createcustomer(customername,gender,dateofbirth,address, city, state, pin, mobilenumber, email,password);
    
    }
    
    @Then("^User should click on submit$")
    public void user_should_click_on_submit() throws Throwable {
        
    }

}
