package testcases;

import org.testng.Assert;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Testbase;
import pages.CredentialsPage;
import pages.HomePage;
import pages.Loginpage;

public class CredentialsPageTest extends Testbase {

	Loginpage loginPage;
	CredentialsPage credPage;
	HomePage homePage;

	CredentialsPage credentialPage;

//	public CredentialsPageTest() {
//		super();
//	}

	@BeforeMethod
	public void setUp() {
		browserUrl();
		loginPage = new Loginpage();
		loginPage.loginButtonClick();
		credPage = new CredentialsPage();

	}

	@Test(priority=1)
	public void credentialsPageTitleTest() {
		String title = credPage.validateCredentialsPage();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage = credPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		//driver.close();
		driver.quit();
	}

}
