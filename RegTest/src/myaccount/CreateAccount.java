package myaccount;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generalrepo.*;
public class CreateAccount {
public static void newacc(WebDriver driver) throws IOException {
	System.out.println("Going to create account");
	FileInputStream fis =new FileInputStream("C://Users//dev-dksc102833//Documents//eclipse//Learning Docs//Selenium_SampleScripts//Automated scripts//HandlingPropertiesfile//emp.properties");
	Properties prop =new Properties();
	prop.load(fis);
	WebElement element;
	driver.findElement(By.cssSelector(".header-mc-text")).click();
	element = driver.findElement(By.cssSelector(".continue-btn"));
	WaitFor.wait(driver, element);
	driver.findElement(By.cssSelector(".continue-btn")).click();
	element = driver.findElement(By.cssSelector(".ca-email"));
	WaitFor.wait(driver, element);
	driver.findElement(By.cssSelector(".ca-email")).click();
	driver.findElement(By.cssSelector(".ca-email")).sendKeys(prop.getProperty("newemail"));
	
}
}
