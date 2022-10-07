package com.macys;

import org.testng.annotations.Test;
import java.awt.Dimension;
import java.security.PublicKey;
import java.sql.Driver;

import javax.xml.xpath.XPathConstants;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePageTest extends Base {
	private static final org.openqa.selenium.Dimension Dimension = null;
	private static final boolean e = false;

	@Test(enabled = false, priority = 1)
	public void logoTest() {
		homePage.logo.isDisplayed();

	}

	@Test(enabled = false, priority = 2)
	public void clickSingInButton() throws InterruptedException {
		homePage.singInButtonClicked();
	}

	@Test(enabled = false, priority = 3)
	public void clickUserIdField() {
		homePage.clickUserIdFieldClicking();

	}

	@Test(enabled = false, priority = 4)
	public void forgetPassword() throws InterruptedException {
		homePage.forgetPasswordClicked1();
	}

	@Test(enabled = false)
	public void singInButtonTest2() throws InterruptedException {
		boolean singInButtonEnabled = driver.findElement(By.className("button primary expanded")).isEnabled();
		System.out.println("Is The sing in Button Enabled? Ans: " + singInButtonEnabled);
		Thread.sleep(2000);

	}// new hw 22

	@Test(enabled = false)
	public void searchButtonClickTesting() {
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).click();
	}

	@Test(enabled = false)
	public void applyForMacysCraditCardTest() {
		// driver.get("https://www.bestbuy.com/");
		driver.findElement(By.linkText("Apply for Macy's Credit Card")).click();
	}

	@Test(enabled = false)
	public void cardholderBenefitsTest() {
		driver.findElement(By.partialLinkText("Cardholder B")).click();
	}

	@Test(enabled = false)
	public void logoIsDisplayedTest() {
		driver.findElement(By.className("header-logo__image")).isDisplayed();
	}

	@Test(enabled = false)
	public void zipCodeFieldClickTest() {
		driver.get("https://www.walgreens.com/");
		driver.findElement(By.name("input#searchCriteria")).click();
	}

	@Test(enabled = false)
	public void orderReturnButtonTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.id("https://www.costco.com/")).click();
	}

	@Test(enabled = false)
	public void searchButtonTest1() {
		driver.findElement(By.cssSelector("input.globalSearchInputField")).click();
	}

	@Test(enabled = false)
	public void bagIconTest() {
		driver.findElement(By.cssSelector("span.bag-icon-reskin")).click();
	}

	@Test(enabled = false)
	public void shopButtonTest() {
		driver.get("https://www.costco.com/");
		driver.findElement(By.cssSelector("a#navigation-dropdown")).click();

	}

	// Home Work 23

	@Test(enabled = false)
	public void use_isDisplayTest() {
		driver.findElement(By.cssSelector("a.header-logo__image")).isDisplayed();
	}

	@Test(enabled = false)
	public void signMeUpButtonTest() {
		driver.findElement(By.className("sign-up-submit")).isEnabled();
	}

	@Test(enabled = false)
	public void weddingRegistryButtonTest() {
		driver.findElement(By.id("registry-link")).isSelected();
	}

	@Test(enabled = false)
	public void use_Of_Get_Tittle_Method() {
		System.out.println("The Tittle of the page is " + driver.getTitle());
	}

	@Test(enabled = false)
	public void use_Of_GetCurrentUrl_Method() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='canvas']")).click();
		System.out.println("The use of The page URL" + driver.getCurrentUrl());
		Thread.sleep(2000);

	}

	@Test(enabled = false)
	public void use_of_GetText_Method() {
		WebElement nur = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
		System.out.println("The text for the Web Element is: " + nur.getText());

	}

	@Test(enabled = false)
	public void use_of_GetAttribute_Method() {
		driver.findElement(By.className("sign-up-submit")).getAttribute("class");
	}

	@Test(enabled = false)
	public void use_of_sendKeys_method() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("adidas");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).sendKeys("Nike", Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='globalSearchInputField']")).clear();
		Thread.sleep(4000);

	}

	@Test(enabled = false)
	public void use_of_navigate_method() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().to("https://www.macys.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Test(enabled = false)
	public void setASpecificSizeOfWindow() throws InterruptedException {
		new Dimension(800, 500);
		driver.manage().window().setSize(Dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com/");
		Thread.sleep(4000);
		System.out.println("The size of the screen is: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
}
