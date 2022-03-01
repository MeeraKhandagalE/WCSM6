package testPackage;

import java.io.IOException;

import generic.BaseTest;
import generic.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;

public class TestActiTImeLogout extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "un");
		String validPassword = flib.readPropertyData(PROP_PATH, "pass");
		lp.validLogin(validUsername, validPassword);
		
		HomePage hp = new HomePage(driver);
		hp.logout();
		
	}

}