package com.macys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	private static final String HOW = null;

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='header-logo__image']")
	WebElement logo;
	
	@FindBy(xpath = "//button[@class='button primary expanded']")
	WebElement signInButton2;
	
	@FindBy(xpath="//input[@name='user.email_address']")
	WebElement clickUserIdField;
	
	@FindBy(how=How.XPATH,using="//a[@id='forgot-password']")
	WebElement forgetPassword;
	
	By signIn=By.xpath("//span[text()='Sign In']");
	
	By frgtpass=By.xpath("//a[@id='forgot-password']");
	
	
	public  boolean logoDisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("The logo is displayed: " + flag);
		return flag;
	}
	public void clickUserIdField() {
		clickUserIdField.click();
	}
	public void singInButtonClicked() throws InterruptedException{
		signInButton2.click();
		Thread.sleep(5000);
	}
	
	public void forgetPasswordClicked() throws InterruptedException{
		forgetPasswordClicked();
			Thread.sleep(5000);		
	}
	public void forgetPasswordClicked1() throws InterruptedException {
		driver.findElement(signIn).click();
		Thread.sleep(2000);
		driver.findElement(frgtpass).click();
	}
	
}
