package generalrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewDriver {

	public static WebDriver startdriver() {

		  System.setProperty("webdriver.chrome.driver","C://Users//dev-dksc102833//Documents//eclipse//Drivers//chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  //driver.get("https://NextGen:Eagle2015@m-dks-qa1.dksxchange.com");
		  driver.get("https://dks-qa1.dksxchange.com");
		return driver;
	}

}
