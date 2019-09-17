import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutGu {

	public static void slsu(WebDriver driver, String bopisitem, String gemail, String ccno, String ccmonth,
			String ccyear, String ccpin) {
		driver.findElement(By.xpath("//*[@id='searchField']")).click();
		driver.findElement(By.xpath("//*[@id='searchField']")).sendKeys(bopisitem);
		driver.findElement(By.xpath("//*[@id='headerSearchButton']")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WaitFor.wait(driver,"//*[@id='product-quantity']");
		int defattributes = driver.findElements(By.xpath("//*[@class='col-xs-12 defining-attribute-label']")).size();
		if(defattributes>1){
			Resolvesku.select(driver,defattributes);
		}
		driver.findElement(By.xpath("//*[@class='col-xs-12 div-btn in-stock-btn']/button")).click();
		driver.findElement(By.xpath("//*[@name='zipCode']")).click();
		driver.findElement(By.xpath("//*[@name='zipCode']")).sendKeys("15108");
		driver.findElement(By.xpath("//*[@id='modal-body']/compile-content/div/form/div/button")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath(" //*[@class='pick-up-btn btn'][1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='btn-main btn-padding dsg-button dsg-primary-btn']")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='layout-content']/ui-view/div/div/div[2]/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@data-em='SignIn_GuestCheckout']")).click();
		driver.findElement(By.xpath("//*[@id='firstName']")).click();
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("smoke");
		driver.findElement(By.xpath("//*[@id='lastName']")).click();
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id='street']")).click();
		driver.findElement(By.xpath("//*[@id='street']")).sendKeys("345 court");
		driver.findElement(By.xpath("//*[@id='city']")).click();
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("Coraopolis");
		driver.findElement(By.xpath("//*[@id='state']")).click();
		driver.findElement(By.xpath("//*[@id='state']/option [contains(.,'CA')]")).click();
		driver.findElement(By.xpath("//*[@id='zipcode']")).click();
		driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("15108");
		driver.findElement(By.xpath("//*[@id='phone']")).click();
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("2111111111");
		driver.findElement(By.xpath("//*[@id='emailAddressField']")).click();
		driver.findElement(By.xpath("//*[@id='emailAddressField']")).sendKeys(gemail);
		driver.findElement(By.xpath("//*[@id='layout-content']/ui-view/div/div[2]/ui-view/div/div[1]/form/button")).click();
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-modal-primary avs-button']")).click();
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
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='review-submit-btn']/span/button")));
		if(driver.findElements(By.xpath("//*[@id='modal-body']/compile-content/div[3]/div/button")).size() != 0){
			driver.findElement(By.xpath("//*[@id='modal-body']/compile-content/div[3]/div/a")).click();
		}
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='review-submit-btn']/span/button")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='layout-content']/ui-view/div/div[2]/ui-view/div/section/p[2]")));
		
	}

}
