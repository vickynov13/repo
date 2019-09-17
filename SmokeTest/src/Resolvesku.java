import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resolvesku {
	public static void select(WebDriver driver, int defattributes) {

	for (int i=1; i<defattributes;i++){
		int colorswatches = driver.findElements(By.xpath("//*[@alt='Color Swatch']")).size();
		System.out.println("inside for defattributes");
		if (colorswatches>1){
			WebElement element= driver.findElement(By.xpath("//*[@alt='Color Swatch']["+i+"]"));
			System.out.println("colorswatch > 1");
			if (element.isDisplayed() && element.isEnabled()) {
			    element.click();
			    System.out.println("Color swatch selected");
			   // Thread.sleep(4000);
		}else{
			int k=i+1;
			driver.findElement(By.xpath("//*[@alt='Color Swatch']["+k+"]")).click();
			System.out.println("Next Color swatch selected");
			}
		}
		int sizeswatches = driver.findElements(By.xpath("//*[@class='size-swatch']")).size();
		if (sizeswatches>1){
			for (int j=1;j<=sizeswatches;j++){
				System.out.println("inside for swatch");
			WebElement element1= driver.findElement(By.xpath("//*[@class='size-swatch']["+j+"]"));
			if (element1.isDisplayed() && element1.isEnabled()) {
				//Thread.sleep(4000);
			    element1.click();
			    System.out.println("Size swatch selected");
			  //  Thread.sleep(4000);
			}if(driver.findElement(By.xpath("//*[@id='product-add-cart-div']/div[3]/div[1]/button")).isEnabled()){
				break;
			}
			}
			
		}if(driver.findElement(By.xpath("//*[@id='product-add-cart-div']/div[3]/div[1]/button")).isEnabled()){
			break;
		}
		}
	
	}
}
