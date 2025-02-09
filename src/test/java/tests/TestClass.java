package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.LoginPage;
import pages.LogoutPage;

public class TestClass extends BaseClass{
	private LoginPage login;
	private LogoutPage logout;
	
	@BeforeMethod
	public void setupTest() {
	login = new LoginPage();
	logout = new LogoutPage();
	}
	
	@Test
	public void logintest() {
		login.completeLogin();
	}
	
	@Test
	public void logouttest() {
		logout.logoutPage();
	}
	
}
