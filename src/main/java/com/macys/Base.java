package com.macys;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	WebDriver driver;
	
	public HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+".\\driver\\chromedriver.exe");
		//driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\khale\\eclipse-workspace\\com.macys\\driver\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		//driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.macys.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    homePage = new HomePage(driver);

}
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
}