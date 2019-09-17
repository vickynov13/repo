package myaccount;

import org.testng.annotations.Test;

import generalrepo.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class MyAccMain {
	WebDriver driver;
	@BeforeSuite
	public void beforesuite(){
	System.out.println("Starting Somke Test");	
	}
	@AfterSuite
	public void aftersuite(){
	System.out.println("Ending Somke Test");	
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("Nothing to do Before Test");	
	}
	@AfterTest
	public void aftertest(){
		System.out.println("Nothing to do After Test");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("Nothing to do before class");
	}
	@AfterClass
	public void afterclass(){
		System.out.println("Nothing to do After class");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Starting driver Before Method");
		driver=NewDriver.startdriver();
	}
	@AfterMethod
	public void aftermethod(){
	System.out.println("Taking Screenshot for this test");
	TakeScreenshot.capture(driver);
	//driver.quit();		
	}
	@Test
	public void createaccount(){
		
		try {
			CreateAccount.newacc(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
}
