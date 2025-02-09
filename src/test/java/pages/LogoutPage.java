package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.BaseClass;

public class LogoutPage extends BaseClass {
	LoginPage login = new LoginPage();
	
	public void logoutPage() {
		//login.completeLogin();
		click(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		click(By.xpath("//a[contains(text(),'Logout')]"));
		Boolean logoutValidation = wait.until(ExpectedConditions.urlContains("/auth/login"));
		assertTrue(logoutValidation, "Logout failed");
	}

}
