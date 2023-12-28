package POM_Repositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shipppingmethod extends BasePage {

	public shipppingmethod(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement Continue2;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement continue3;
	
	
	@FindBy(id = "paymentmethod_0")
	private WebElement cod;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement continue4;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement continue5;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirm6;
	
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
	private WebElement confirmationmessage;

	public WebElement getContinue2() {
		return Continue2;
	}

	public WebElement getContinue3() {
		return continue3;
	}

	public WebElement getCod() {
		return cod;
	}

	public WebElement getContinue4() {
		return continue4;
	}

	public WebElement getContinue5() {
		return continue5;
	}

	public WebElement getConfirm6() {
		return confirm6;
	}

	public WebElement getConfirmationmessage() {
		return confirmationmessage;
	}


}
