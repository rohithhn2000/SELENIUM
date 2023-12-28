package POM_Repositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BasePage{
	public LoginPage(WebDriver driver) {
	super(driver);

}
	@FindBy(id="Email")
	private WebElement email;
	
	
	@FindBy(id="Password")
	private WebElement password;
	
	
	
	@FindBy(id="RememberMe")
	private WebElement Rememberme;
	
	@FindBy(linkText ="Forgot password?")
	private WebElement Forgotpass;
	
	@FindBy(xpath = "//input[@value='Laptop']")
	private WebElement Laptopsearch;
	
	public WebElement getLaptop() {
		return Laptopsearch;
		
	}
	@FindBy(id = "bar-notification")
	private WebElement Shoppingcartmessage;
	
	public WebElement getShoppingcartmessage() {
		return Shoppingcartmessage;
	}
	
	@FindBy(xpath = "//h1[text()='Search']")
	private WebElement searchpage;
	
	public WebElement getSearchpage() {
		return searchpage;
	}
	
	@FindBy(xpath = "//a[text()='14.1-inch Laptop']/../../..")
	private WebElement Laptopmodel;
	
	public WebElement getLaptopmodel() {
		return Laptopmodel;
	}
	
	@FindBy(xpath = "//a[@class='product-name']")
	private WebElement productname;
	
	public WebElement getproductname() {
		return productname;
	}
	@FindBy(xpath = "//a[text()='14.1-inch Laptop']/../../..//input[@value='Add to cart']")
	private WebElement laptopcart;
	
	public WebElement getlaptopcart() {
		return laptopcart;
	}
	
	
	@FindBy(xpath = "//a[text()='wishlist']")
	private WebElement wishlistmessage;
	
	public WebElement getwishlistmessage() {
		return wishlistmessage;
	}
	
	
	
	@FindBy(xpath = "//p[@class='content']")
	private WebElement shoppingmessage;
	
	public WebElement getShoppingmessage() {
		return shoppingmessage;
	}

	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement Login1;
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../../..//input[@value='Add to cart']")
	private WebElement bookaddtocart;
	
	@FindBy(xpath= "//a[contains(text(),'s Rockabilly')]/../../..//input[@value='Add to cart']")
	private WebElement dressaddtocart;
	
	@FindBy(id = "add-to-cart-button-5")
	private WebElement rockbillyaddtocart;
	
	public WebElement getRockbillyaddtocart() {
		return rockbillyaddtocart;
	}

	
	@FindBy(xpath= "//a[@class='product-name']/../../..//a[contains(text(), 'Rock')]")
	private WebElement rokabilly;
	
	
	public WebElement getRokabilly() {
		return rokabilly;
	}

	
	@FindBy(id="add-to-wishlist-button-5")
	private WebElement wishlist;

	public WebElement getEmail() {
		return email;
	}

	

	public WebElement getPassword() {
		return password;
	}



	public WebElement getRememberme() {
		return Rememberme;
	}

	

	public WebElement getForgotpass() {
		return Forgotpass;
	}

	

	public WebElement getLogin1() {
		return Login1;
	}

	

	public WebElement getBookaddtocart() {
		return bookaddtocart;
	}

	

	public WebElement getDressaddtocart() {
		return dressaddtocart;
	}



	public WebElement getWishlist() {
		return wishlist;
	}

	
	}
	
	
	
	
