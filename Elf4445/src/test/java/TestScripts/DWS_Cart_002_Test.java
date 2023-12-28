package TestScripts;
/***
 * @author ROHITH HN
 */
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POM_Repositiry.LoginPage;
import genric_Lib.Baseclass;
import genric_Lib.Excel_lib;

public class DWS_Cart_002_Test extends Baseclass {
	@Test
	public void DWS_Cart_002_Test() {
		
		LoginPage book = new LoginPage(driver);
		book.getBooks().click();
		Assert.assertEquals("not clicked on Books", book.getBooks().getText(), Excel_lib.readingdata("Sheet1", 13, 0));
		Reporter.log("clicked on Books link", true);
		book.getBookaddtocart().click();
		Reporter.log("clicked on add to cart", true);
		Assert.assertEquals("The product has been added to your shopping cart", book.getShoppingmessage().getText());
		Reporter.log("Product is added in to the cart", true);
		
		

	}

}
