package TestScripts;
/***
 * @author ROHITH HN
 */
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POM_Repositiry.LoginPage;
import genric_Lib.Baseclass;
import genric_Lib.Excel_lib;

public class DWS_Cart_003_Test extends Baseclass {
	@Test

	public void DWS_Cart_003_Test() {
		LoginPage login = new LoginPage(driver);
		LoginPage book = new LoginPage(driver);

		login.getSearchBox().sendKeys(Excel_lib.readingdata("Sheet1", 12, 0));
		Reporter.log("Laptop is entered", true);
		login.getSearchButton().click();
		Reporter.log("Clicked on search button");
		login.getlaptopcart().click();
		Reporter.log("Add to cart button is clicked", true);
		WebDriverWait explicit=new WebDriverWait(driver, Duration.ofMillis(4000));
		Assert.assertEquals(book.getShoppingmessage().isDisplayed() , book.getShoppingmessage().getText().contains("added to your"));
		Reporter.log("Product is added to cart", true);
		explicit.until(ExpectedConditions.visibilityOf(login.getLogout()));
		login.getmessageclose().click();
	}
}
