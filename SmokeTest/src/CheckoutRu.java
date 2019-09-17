import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutRu {

	public static void slsu(WebDriver driver, String regemail, String epass, String regitem, String ccno, String ccmonth, String ccyear, String ccpin) {
		driver.findElement(By.xpath("//*[@id='searchField']")).click();
		driver.findElement(By.xpath("//*[@id='searchField']")).sendKeys(regitem);
		driver.findElement(By.xpath("//*[@id='headerSearchButton']")).click();
		WaitFor.wait(driver,"//*[@alt='Color Swatch']");
		int defattributes = driver.findElements(By.xpath("//*[@class='col-xs-12 defining-attribute-label']")).size();
		if(defattributes>1){
			Resolvesku.select(driver,defattributes);
		}
		WaitFor.wait(driver, "//*[@id='product-add-cart-div']/div[3]/div[1]/button");
		driver.findElement(By.xpath("//*[@id='product-add-cart-div']/div[3]/div[1]/button")).click();
		WaitFor.wait(driver,"//*[@id='modal-body']/compile-content/div[1]/button");
		driver.findElement(By.xpath("//*[@id='modal-body']/compile-content/div[1]/button")).click();
		WaitFor.wait(driver,"//*[@id='layout-content']/ui-view/div/div/div[2]/div[4]/button");
		driver.findElement(By.xpath("//*[@id='layout-content']/ui-view/div/div/div[2]/div[4]/button")).click();
		WaitFor.wait(driver,"//*[@id='txtEmail']");
		driver.findElement(By.xpath("//*[@id='txtEmail']")).click();
		driver.findElement(By.xpath("//*[@id='txtEmail']")).sendKeys(regemail);
		driver.findElement(By.xpath("//*[@id='txtPassword']")).click();
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(epass);
		driver.findElement(By.xpath("//*[@id='layout-content']/ui-view/div/ng-include/div/div[1]/div[2]/div[1]/form/button")).click();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WaitFor.wait(driver,"//*[@class='btn-link-checkout btn-link btn-edit col-xs-3'][1]");
		System.out.println("going to select address");
		int selectedbaddress = driver.findElements(By.xpath("//*[@class='checkout-address selected-address' and contains(.,'Billing')]")).size();
		int selectedsaddress = driver.findElements(By.xpath("//*[@class='checkout-address selected-address' and contains(.,'Shipping')]")).size();
		if (selectedbaddress==0){
			System.out.println("No Billing Address Selected");
			driver.findElement(By.xpath("//*[@class='checkout-address' and contains(.,'Billing')][1]")).click();
		}if(selectedsaddress==0){
			System.out.println("No Shipping Address Selected");
			driver.findElement(By.xpath("//*[@class='checkout-address' and contains(.,'Shipping')][1]")).click();
		}
			System.out.println("Both Address Selected");
			driver.findElement(By.xpath("//*[@id='layout-content']/ui-view/div/div[2]/ui-view/div/div/p/button")).click();		
		WaitFor.wait(driver,"//*[@id='layout-content']/ui-view/div/div[2]/ui-view/div/div/div[3]/button");
		driver.findElement(By.xpath("//*[@id='layout-content']/ui-view/div/div[2]/ui-view/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@name='ccNumber']")).click();
		driver.findElement(By.xpath("//*[@name='ccNumber']")).sendKeys(ccno);
		driver.findElement(By.xpath("//*[@name='expMonth']")).click();
		driver.findElement(By.xpath("//*[@name='expMonth']/option[contains(.,'"+ccmonth+"')]")).click();
		driver.findElement(By.xpath("//*[@name='expYear']")).click();
		driver.findElement(By.xpath("//*[@name='expYear']/option[contains(.,'"+ccyear+"')]")).click();
		driver.findElement(By.xpath("//*[@name='securityPin']")).click();
		driver.findElement(By.xpath("//*[@name='securityPin']")).sendKeys(ccpin);
		driver.findElement(By.xpath("//*[@name='cybsSubmit']")).click();
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WaitFor.wait(driver, "//*[@class='review-submit-btn']/span/button");
		if(driver.findElements(By.xpath("//*[@id='modal-body']/compile-content/div[3]/div/button")).size() != 0){
			driver.findElement(By.xpath("//*[@id='modal-body']/compile-content/div[3]/div/a")).click();
		}
		WaitFor.wait(driver, "//*[@class='review-submit-btn']/span/button");
		driver.findElement(By.xpath("//*[@class='review-submit-btn']/span/button")).click();
		//driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WaitFor.wait(driver, "//*[@id='layout-content']/ui-view/div/div[2]/ui-view/div/section/p[2]");
		
		
	}

}
