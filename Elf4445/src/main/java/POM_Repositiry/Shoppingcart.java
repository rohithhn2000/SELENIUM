package POM_Repositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shoppingcart extends BasePage {

	public Shoppingcart(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//td//span[text()='Remove:']")
	private WebElement checkbox;
	
	@FindBy(id = "termsofservice")
	private WebElement termsandcond;
	
	@FindBy(id = "checkout")
	private WebElement checkout;
	
	@FindBy(xpath = "//h2[text()='Shipping address']")
	private WebElement shippingadress;
	
	public WebElement getshipadress() {
		return shippingadress;}
	
	@FindBy(xpath = "//h2[text()='Shipping method']")
	private WebElement shippingmethod;
	
	public WebElement getshipmethod() {
		return shippingmethod;}
	
	@FindBy(xpath = "//input[@value=\"Payments.CashOnDelivery\"]")
	private WebElement cod;
	
	public WebElement getcod() {
		return cod;}
	@FindBy(xpath = "//h2[text()='Payment information']")
	private WebElement Payment;
	
	public WebElement getpayment() {
		return Payment;}
	
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement ordermessage;
	
	public WebElement getordermessage() {
		return ordermessage;}
	
	@FindBy(id = "opc-confirm_order")
	private WebElement confirmorder;
	
	public WebElement getconfirm() {
		return confirmorder;}
	
		
	public WebElement getcheckbox() {
		return checkbox;
	}


	public WebElement getTermsandcond() {
		return termsandcond;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	

	
	
}
