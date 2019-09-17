import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor {

	public static void wait(WebDriver driver, String elem) {
		// TODO Auto-generated method stub
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		WebElement element5 = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath(elem)));
		
	}

}
