package TestScripts;
/***
 * @author ROHITH HN
 */

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import POM_Repositiry.LoginPage;
import genric_Lib.Baseclass;
import genric_Lib.Excel_lib;


public class DWS_signup_001_Test extends Baseclass{
	@Test
	public  void DWS_signup_001()  {
	LoginPage login=new LoginPage(driver);
	WebElement Emailid = login.getcustomername();
	Assert.assertEquals("Homepage is not displayed",Emailid.getText(), Excel_lib.readingdata("Sheet1", 0, 0));
	Reporter.log("Homepage is displayed", true);
	}
	
	
}
