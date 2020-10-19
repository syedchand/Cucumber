package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import data.ExcelUtils;

public class CreateCustomerPage {
	
	WebDriver driver;
	
	//------------------------------- WebElements -----------------------------
	@FindBy(linkText="New Customer")
	WebElement NewCustomer;
	@FindBy(xpath="//*[@class='heading3']")
	WebElement AddNewCustomer;
	@FindBy(name="name")
	WebElement Fname;
	@FindBy(xpath="//input[@value='m']")
	WebElement Gender;
	@FindBy(xpath="//input[@name='dob']")
	WebElement DOB;
	@FindBy(xpath="//*[@name='addr']")
	WebElement Address;
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pinno;
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement telephoneno;
	@FindBy(xpath="//input[@name='emailid']")
	WebElement emailid;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//*[@type='submit' or @name='sub']")
	WebElement sub;
	
	
	//-------------------------------- Method --------------------------------
	 
	public CreateCustomerPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createcustomer(String sCustomername, String sGender, String sDateofbirth, String sAddress, String sCity, String sState, String sPin, String sMobilenumber, String sEmail, String sPassword) throws Exception {
		
		//WebElement NewCustomer = driver.findElement(By.linkText("New Customer"));
		NewCustomer.click();
		
		//WebElement AddNewCustomer = driver.findElement(By.xpath("//*[@class='heading3']"));
		if(AddNewCustomer.isDisplayed()) {
			System.out.println("Add new customer is displayed");
			
			
		} else {
			
			System.out.println("Add new customer is not displayed");
		}
		
		//String FirstName = ExcelUtils.getCellData(1, 2);
		
		//WebElement Fname = driver.findElement(By.name("name"));
		//Fname.sendKeys("Chand");
		Fname.sendKeys(sCustomername);
		//WebElement Gender = driver.findElement(By.xpath("//input[@value='m']"));
		Gender.click();
		//WebElement DOB = driver.findElement(By.xpath("//input[@name='dob']"));
		DOB.sendKeys(sDateofbirth);
		//WebElement Address = driver.findElement(By.xpath("//*[@name='addr']"));
		Address.sendKeys(sAddress);
		city.sendKeys(sCity);
		state.sendKeys(sState);
		pinno.sendKeys(sPin);
		telephoneno.sendKeys(sMobilenumber);
		emailid.sendKeys(sEmail);
		password.sendKeys(sPassword);
		sub.click();
		
		
	}

}
