package com.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (className  = "header-logo__image")
	WebElement logo;
	
	@FindBy(xpath = "//span[text()='Sign In']")
	WebElement signInButton2;
	
	@FindBy(how =How.XPATH , using = "//input[@name='user.email_address']")
	WebElement clickUserIdField;
	
	@FindBy(xpath="//a[@id='forgot-password']")
	WebElement forgetPassword;
	
	@FindBy(id = "forgot-submit-btn")
	WebElement linkButtonElement;
	
	By signIn=By.xpath("//span[text()='Sign In']");
	
	By frgtpass=By.xpath("//a[@id='forgot-password']");
	
	
	public  boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
	public void clickUserIdFieldClicking() {
		driver.findElement(signIn).click();
		clickUserIdField.click();
	}
	public void singInButtonClicked() throws InterruptedException{
		signInButton2.click();
		Thread.sleep(2000);
	}
	
	public void forgetPasswordClicked() throws InterruptedException{
		forgetPasswordClicked();
			Thread.sleep(2000);		
	}
	
		
	public void forgetPasswordClicked1() throws InterruptedException {
		driver.findElement(signIn).click();
		driver.findElement(frgtpass).click();
		Thread.sleep(2000);
	}
	
	
	
}
