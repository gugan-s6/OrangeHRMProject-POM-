package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.BaseClass;

public class LoginPage extends BaseClass{
	
	
	public void enterUsername() {
		entertext(By.name("username"), "Admin");
		System.out.println("username is entered");
	}
	
	public void enterPassword() {
		entertext(By.name("password"), "admin123");
		System.out.println("password is entered");
	}
	
	public void loginClick() {
		click(By.xpath("//button[@type=\"submit\"]"));
	}
	
	public void completeLogin() {
		enterUsername();
		enterPassword();
		loginClick();
		Boolean loginValidation = wait.until(ExpectedConditions.urlContains("/dashboard/index"));
		assertTrue(loginValidation, "Login validation failed!");
		
	}
	
}
