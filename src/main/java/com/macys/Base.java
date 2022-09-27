package com.macys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\khale\\eclipse-workspace\\com.macys\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.macys.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	    homePage = new HomePage(driver);

}
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
}