import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CreateAccount {
public static void newacc(WebDriver driver, String newemail, String epass) {
	System.out.println("Going to create account");
	driver.findElement(By.xpath("//*[@data-em='Footer_Mobile_MyAccount']")).click();
	driver.findElement(By.xpath("//*[@class='btn-main dsg-button dsg-primary-btn continue-btn']")).click();
	driver.findElement(By.xpath("//*[@type='email' and @name='createAccountEmail']")).click();
	driver.findElement(By.xpath("//*[@type='email' and @name='createAccountEmail']")).sendKeys(newemail);
	driver.findElement(By.xpath("//*[@type='email' and @name='createAccountConfEmail']")).click();
	driver.findElement(By.xpath("//*[@type='email' and @name='createAccountConfEmail']")).sendKeys(newemail);
	driver.findElement(By.xpath("//*[@type='password' and @name='createAccountPassword']")).click();
	driver.findElement(By.xpath("//*[@type='password' and @name='createAccountPassword']")).sendKeys(epass);
	driver.findElement(By.xpath("//*[@type='password' and @name='createAccountConfPassword']")).click();
	driver.findElement(By.xpath("//*[@type='password' and @name='createAccountConfPassword']")).sendKeys(epass);
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
	driver.findElement(By.xpath("//*[@class='btn btn-main dsg-button standard-primary-btn create-account-button']")).click();
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WaitFor.wait(driver, "//*[@class='btn btn-primary btn-modal-primary avs-button']");
	driver.findElement(By.xpath("//*[@class='btn btn-primary btn-modal-primary avs-button']")).click();
	WaitFor.wait(driver, "//*/a[contains(.,'Sign Out')]");
	TakeScreenshot.capture(driver);
	driver.findElement(By.xpath("//*/a[contains(.,'Sign Out')]")).click();
	WaitFor.wait(driver, "//*[@id='layout-content']/ui-view/div/ng-include/div/div[1]/div[1]/div[1]/form/button");
}
}
