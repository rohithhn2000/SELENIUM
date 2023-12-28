package TestScripts;

/***
 * @author ROHITH HN
 */
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POM_Repositiry.Billing;
import POM_Repositiry.LoginPage;
import POM_Repositiry.Shoppingcart;
import POM_Repositiry.shipppingmethod;
import genric_Lib.Baseclass;
import genric_Lib.Excel_lib;

public class DWS_Orders_005_Test extends Baseclass {
	@Test
	public void DWS_Orders_005() {
		LoginPage login = new LoginPage(driver);
		login.getBooks().click();
		assertEquals(driver.getTitle().contains("Books"), driver.getCurrentUrl().contains("books"),
				"Clicked on Books link");
		Reporter.log("Clicked on Books link", true);
		login.getBookaddtocart().click();
		Reporter.log("Clicked on cart");
		assertEquals(login.getShoppingcartmessage().getText().contains("shopping"),
				login.getShoppingcartmessage().isDisplayed(), "Product is not added");
		Reporter.log("Product added to Shoppingcart", true);
		login.getmessageclose().click();
		assertEquals(login.getShoppingcartmessage().isDisplayed(), login.getShoppingcartmessage().isDisplayed(),
				"message  is not closed");
		login.getShoppingCartLink().click();
		assertEquals(driver.getCurrentUrl().contains("cart"), driver.getTitle().contains("Cart"),
				"Clicked on Product and Description opened");
		Reporter.log("Clicked on Shopping cart link", true);
		Shoppingcart shop = new Shoppingcart(driver);
		shop.getTermsandcond().click();
		Reporter.log("Terms and condn checked");
		shop.getCheckout().click();
		assertEquals(driver.getTitle().contains("Checkout"), driver.getCurrentUrl().contains("checkout"),
				"not Clicked on Checkout button");
		Reporter.log("Clicked on checkout button", true);
		Billing bil = new Billing(driver);

		try {
			if (bil.getAdress().isDisplayed()) {
				Select select = new Select(bil.getAdress());
				select.selectByIndex(0);
				Reporter.log("Selected the address", true);
			}
		} catch (NoSuchElementException e) {

			bil.getBillfirstname().clear();
			bil.getBilllasttname().clear();
			bil.getBillemail().clear();
			bil.getBillfirstname().sendKeys(Excel_lib.readingdata("Sheet1", 5, 1));
			bil.getBilllasttname().sendKeys(Excel_lib.readingdata("Sheet1", 6, 1));
			bil.getBillemail().sendKeys(Excel_lib.readingdata("Sheet1", 7, 2));

			Select select1 = new Select(bil.getBillcountry());
			select1.selectByVisibleText("India");

			bil.getBillcity().sendKeys(Excel_lib.readingdata("Sheet1", 10, 1));
			bil.getBilladress1().sendKeys(Excel_lib.readingdata("Sheet1", 11, 1));
			bil.getBillpostal().sendKeys(Excel_lib.readingdata("Sheet1", 12, 1));
			bil.getBillphonenumber().sendKeys(Excel_lib.readingdata("Sheet1", 13, 1));
			WebElement continue1 = bil.getBillcontinue();
			continue1.click();
		}

		shipppingmethod ship = new shipppingmethod(driver);
		WebElement continue2 = ship.getContinue2();
		WebElement continue1 = bil.getBillcontinue();
		continue1.click();
		Reporter.log("Clicked on continue1", true);
		continue2.click();
		Reporter.log("Clicked on continue2", true);
		ship.getContinue3().click();
		Reporter.log("Clicked on continue3", true);
		ship.getContinue4().click();
		Reporter.log("Clicked on continue4", true);
		ship.getContinue5().click();
		Reporter.log("Clicked on continue5", true);
		ship.getConfirm6().click();
		assertEquals(shop.getordermessage().getText().contains("order has been successfully"),
				shop.getordermessage().isDisplayed(), "Clicked on Checkout button");
		Reporter.log("Clicked on checkout button", true);
		if (ship.getConfirmationmessage().isDisplayed()) {
			Reporter.log("Order is confirmed", true);
		} else {
			Reporter.log("Order confirmation is not displayed", true);
		}
	}
}
