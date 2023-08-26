package Pages;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


public class Screenshot {

	public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{
		


	// Step 1) Convert web driver object to TakeScreenshot
	TakesScreenshot scrShot = ((TakesScreenshot)driver);
	
	// Step 2) Call getScreenshotAs method to create image file	
	File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
	
	// Step 3) Copy file to Desired Location
	 //Move image file to new destination
	 File DestFile=new File(fileWithPath);

     //Copy file at destination
	Files.copy(SrcFile, DestFile);

   
	
	
	

	}
}
