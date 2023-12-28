package TestScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repositiry.BasePage;
import POM_Repositiry.LoginPage;
import genric_Lib.Baseclass;

public class DWS_Logout_007_Test extends Baseclass {
	@Test
	public void DWS_Logout_007() {
		LoginPage login = new LoginPage(driver);
		BasePage base = new BasePage(driver);
		login.getLogout().click();
		assertEquals(base.getRegister().getText(), "Register", "Logged out succesfully");
		Reporter.log("Successfully Loggedout", true);
		
	}

}
