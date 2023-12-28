package POM_Repositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billing extends BasePage {

	public Billing(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//label[contains(text(),'Select a billing')]/..//select")
	private WebElement adress;
	
	@FindBy(xpath = "//option[text()='New Address']")
	private WebElement newadresss;
	
	
	public WebElement getAdress() {
		return adress;
	}

	public WebElement getNewadresss() {
		return newadresss;
	}

	
	@FindBy(xpath = "//h1[text()='Checkout']/../..//label[text()='First name:']/..//input")
	private WebElement billfirstname;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement billlasttname;
	
	
	@FindBy(id = "BillingNewAddress_Email")
	private WebElement billemail;
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement billcountry;
	
	@FindBy(id = "BillingNewAddress_City")
	private WebElement billcity;
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement billadress1;
	
	@FindBy(id = "BillingNewAddress_Address2")
	private WebElement billadress2;
	
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement billpostal;
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement billphonenumber;
	
	
	@FindBy(id = "BillingNewAddress_FaxNumber")
	private WebElement billfax;
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billcontinue;

	public WebElement getBillfirstname() {
		return billfirstname;
	}

	public WebElement getBilllasttname() {
		return billlasttname;
	}

	public WebElement getBillemail() {
		return billemail;
	}

	public WebElement getBillcountry() {
		return billcountry;
	}

	public WebElement getBillcity() {
		return billcity;
	}

	public WebElement getBilladress1() {
		return billadress1;
	}

	public WebElement getBilladress2() {
		return billadress2;
	}

	public WebElement getBillpostal() {
		return billpostal;
	}

	public WebElement getBillphonenumber() {
		return billphonenumber;
	}

	public WebElement getBillfax() {
		return billfax;
	}

	public WebElement getBillcontinue() {
		return billcontinue;
	}

	
}
