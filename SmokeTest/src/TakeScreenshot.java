import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	public static void capture(WebDriver driver) {
		// TODO Auto-generated method stub
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
			LocalDateTime filename = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			String formatDateTime = filename.format(formatter);
			System.out.println("File Name "+formatDateTime);
		FileUtils.copyFile(src, new File("C:/selenium/"+formatDateTime+".png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	}

	public static void captureres(WebDriver driver, String status) {
		// TODO Auto-generated method stub
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
			LocalDateTime filename = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
			String formatDateTime = filename.format(formatter);
			System.out.println("File Name "+formatDateTime);
		FileUtils.copyFile(src, new File("C:/selenium/"+formatDateTime+status+".png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }
	}
}
