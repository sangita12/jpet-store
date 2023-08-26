package Pages;

import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.WebDriver;

//import java.io.File;

//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;

//import com.google.common.io.Files;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Comman {
	
	public static String uname;
	public static String password = "Test@1234";
	
	public static String reportFilePath = "C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj\\TestReport";
	
	public static String extentReportFile = reportFilePath + "\\TestReport_" + System.currentTimeMillis() + ".html";
	
	
	// Create object of extent report and specify the report file path.
	public static ExtentReports extent = new ExtentReports(extentReportFile, false);
	
	// Start the test using the ExtentTest class object.
	
	public static ExtentTest extentTest = extent.startTest("Verification of the Ordering System in the JPet.",
			"Verify Customers can place an order with valid Users and Payment details.");
			
	public static String extentReportImage = reportFilePath	+ "\\extentReportImage.jpg";
	
	// For TC002
	
	public static ExtentReports extent002 = new ExtentReports(extentReportFile, false);	
	public static ExtentTest extentTest002 = extent002.startTest("Verification of the Ordering System in the JPet.", 
			"Verify Customers should not be able to Order until he/she login to the application");
	public static String extentReportImage002 = reportFilePath	+ "\\extentReportImage.jpg";

	//For TC003
	/*
	public static ExtentReports extent003 = new ExtentReports(reportFilePath, false);
	public static ExtentTest extentTest003 = extent003.startTest("Verification of the Ordering System in the JPet.",
			"Verify the Customers are able to update the Payment Details and Billing Address details and with the changed details, Customers able to Order the Products");
	
	public static String extentReportImage003 = reportFilePath	+ "\\extentReportImage.jpg";
	

	}
	
	*/
}
	/*
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
		*/


