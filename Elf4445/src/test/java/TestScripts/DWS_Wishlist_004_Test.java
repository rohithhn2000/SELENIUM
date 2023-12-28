package TestScripts;
/***
 * @author ROHITH HN
 */
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repositiry.LoginPage;
import genric_Lib.Baseclass;
import genric_Lib.Excel_lib;

public class DWS_Wishlist_004_Test extends Baseclass {
	@Test
	public void DWS_Wishlist_004() {
		LoginPage login = new LoginPage(driver);
		login.getApparalesAndShoes().click();
		assertEquals(login.getApparalesAndShoes().getText().contains("Apparels"),
				driver.getCurrentUrl().contains("Apparels"), "Clicked on Apparels");
		Reporter.log("Clicked on Apparels and Shoes", true);
		login.getDressaddtocart().click();
		assertEquals(driver.getCurrentUrl().contains("Rockabilly"), driver.getCurrentUrl().contains("Rockabilly"),
				"Clicked on Product and Description opened");
		Reporter.log("Clicked on product", true);
		login.getRockbillyaddtocart().click();
		Reporter.log("Clicked on add to cart", true);
		login.getShoppingCartLink().click();
		assertEquals(driver.getCurrentUrl().contains("cart"), driver.getTitle().contains("Cart"),
				"Clicked on Product and Description opened");
		Reporter.log("Clicked on Shopping cart link", true);
		login.getRokabilly().click();
		assertEquals(driver.getCurrentUrl().contains("Rockabilly"), driver.getCurrentUrl().contains("Rockabilly"),
				"Clicked on Product was not succesfull");
		Reporter.log("Clicked on Product and Description opened", true);
		login.getWishlist().click();
		assertEquals(login.getwishlistmessage().getText().contains("wishlist"),
				login.getwishlistmessage().isDisplayed(), "Product is not added");
		Reporter.log("Product added to wishlist", true);
		login.getmessageclose().click();

	}
}
