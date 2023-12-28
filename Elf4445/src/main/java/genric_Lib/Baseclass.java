package genric_Lib;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_Repositiry.LoginPage;
import generic_lib.Excel_Lib;

public class Baseclass {
public WebDriver driver;	
	@Parameters("browser")
	@BeforeClass
	
	public void launch(String browsername )  {
		//String browsername=System.getProperty("bname");
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			Reporter.log("Invalid browser", true);
		}
		Reporter.log("Browser launched succesfully", true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		String url="https://demowebshop.tricentis.com/";
		driver.get(url);
		assertEquals(Excel_lib.readingdata("Sheet1", 2, 1), driver.getCurrentUrl());
		Reporter.log("test URL is entered succesfully", true);
		LoginPage login=new LoginPage(driver);
		login.getLogin().click();
		Reporter.log("clicked on login link", true);
		login.getEmail().sendKeys(Excel_lib.readingdata("Sheet1", 0, 0));
		Reporter.log("Emailid is entered", true);
		login.getPassword().sendKeys(Excel_lib.readingdata("Sheet1", 0, 1));
		Reporter.log("Password is entered", true);
		login.getLogin1().click();
		Reporter.log("clicked on login button", true);
	}

	
		
	

	

	@AfterClass
	public void logout() throws InterruptedException {
		
//		WebElement Logout =driver.findElement(By.linkText("Log out"));
//		if(Logout.isDisplayed()) {
//			Logout.click();
			driver.quit();
		}
	}
		
//}
