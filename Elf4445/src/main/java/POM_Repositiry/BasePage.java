package POM_Repositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
public BasePage(WebDriver driver) {
PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Register")
private WebElement Register;


@FindBy(linkText = "Log in")
private WebElement login; 

@FindBy(xpath="//div[@class='header-links']/..//a[@class='account']")
private WebElement username;

@FindBy(xpath = "//span[text()='Shopping cart']")
private WebElement shoppingCartLink; 

@FindBy(xpath = "//span[text()='Wishlist']")
private WebElement wishlistLink; 

@FindBy(id = "small-searchterms")
private WebElement searchBox;

@FindBy(xpath = "//input[@value='Search']")
private WebElement searchButton;

@FindBy(partialLinkText = "BOOKS")
private WebElement books;

@FindBy(partialLinkText = "COMPUTERS")
private WebElement computers;

@FindBy(partialLinkText = "ELECTRONICS")
private WebElement electronics;

@FindBy(xpath = "(//a[contains(text(), 'Apparel')])[1]")
private WebElement apparalesAndShoes;

@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
private WebElement digitalDownloads;

@FindBy(partialLinkText = "JEWELRY")
private WebElement jewelry;

@FindBy(partialLinkText = "GIFT CARDS")
private WebElement giftCards;

@FindBy(linkText = "Log out")
private WebElement Logout;

@FindBy(xpath = "//a[@href='/customer/info']/..//a[text()='deepa007@gmail.com']")
private WebElement customername;

@FindBy(xpath = "//span[@title='Close']")
private WebElement messageclose;

public WebElement getmessageclose() {
	return messageclose;
}

public WebElement getcustomername() {
	return customername;
}

public WebElement getLogout() {
	return Logout;
}

public WebElement getCustomername() {
	return customername;
}

public WebElement getRegister() {
	return Register;
}

public WebElement getLogin() {
	return login;
}

public WebElement getUsername() {
	return username;
}

public WebElement getShoppingCartLink() {
	return shoppingCartLink;
}

public WebElement getWishlistLink() {
	return wishlistLink;
}

public WebElement getSearchBox() {
	return searchBox;
}

public WebElement getSearchButton() {
	return searchButton;
}

public WebElement getBooks() {
	return books;
}

public WebElement getComputers() {
	return computers;
}

public WebElement getElectronics() {
	return electronics;
}

public WebElement getApparalesAndShoes() {
	return apparalesAndShoes;
}

public WebElement getDigitalDownloads() {
	return digitalDownloads;
}

public WebElement getJewelry() {
	return jewelry;
}

public WebElement getGiftCards() {
	return giftCards;
}

}



