package com.macys;

import org.testng.annotations.Test;

public class HomePageTest extends Base {
	@Test(enabled = true)
	public void logoTest() {
		homePage.logo.isDisplayed();		

	}
	@Test(enabled = true)
	public void clickSingInButton() throws InterruptedException {
		homePage.singInButtonClicked();
	}
	
	@Test(enabled = true)
	public void clickUserIdField() {
		homePage.clickUserIdField();
	}
	
	@Test(enabled = true)
	public void forgetPassword() throws InterruptedException {
		homePage.forgetPasswordClicked1();
	}

}
