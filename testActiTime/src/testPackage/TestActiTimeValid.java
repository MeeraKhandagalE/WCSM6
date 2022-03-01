package testPackage;

import java.io.IOException;

import org.junit.Test;

import generic.BaseTest;
import generic.Flib;
import pagePackage.LoginPage;

public class TestActiTimeValid extends BaseTest 
{

	@Test
	public void login() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyData(PROP_PATH, "UN");
		String validPassword = flib.readPropertyData(PROP_PATH, "pass");
	}
}
