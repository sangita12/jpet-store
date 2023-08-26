package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

import Pages.AddToCart;
import Pages.Comman;
import Pages.ExtentManager;

public class Order_TC_002 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome","C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("1. Browser opened successfully");
		Comman.extentTest002.log(LogStatus.INFO, "1. Browser opened successfully");
		
		
		String expectedURL = "https://petstore.octoperf.com/";
		driver.get(expectedURL);		// Navigate to expectedURL
		System.out.println("2. Entered the URL");
		Comman.extentTest002.log(LogStatus.INFO, "2. Entered the URL");
	
		String actualURL = driver.getCurrentUrl();
		if(expectedURL.equals(actualURL))
		{
			System.out.println("3. Verified the application opened successfully");
			Comman.extentTest002.log(LogStatus.PASS, "3. Verified the application opened successfully");
		}else {
			System.out.println("3. Verified the application opened failed");
			Comman.extentTest002.log(LogStatus.FAIL, "3. Verified the application opened failed");
		}
		
		driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();
		System.out.println("4. Clicked on Enter the Store Link");
		Comman.extentTest002.log(LogStatus.INFO, "4. Clicked on Enter the Store Link");
		
		// Verify redirect to Catalog page
		expectedURL = "https://petstore.octoperf.com/actions/Catalog.action";
		actualURL = driver.getCurrentUrl();
		if(expectedURL.equals(actualURL)) {
			System.out.println("5. User is redirected to Catalog Page. Test Pass");
			Comman.extentTest002.log(LogStatus.PASS, "5. User is redirected to Catalog Page. Test Pass");
		}else {
			System.out.println("5. User is not redirected to Catalog Page. Test Fail");
			Comman.extentTest002.log(LogStatus.FAIL, "5. User is not redirected to Catalog Page. Test Fail");
		}
		
	/*
		AddToCart obj1 = new AddToCart();
	obj1.addCatsToCart(driver);
	
	//Verify the error text message
	
	String expectedText = "You must sign on before attempting to check out. Please sign on and try checking out again.";
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
	String actualText = ele.getText();
	

	if(expectedText.equals(actualText))
	{
		System.out.println("15. Expected message shown: Test Pass");
		Comman.extentTest002.log(LogStatus.PASS, "15. Expected message shown: Test Pass");
	}else {
		System.out.println("15. Expected message not shown: Test Fail");
		Comman.extentTest002.log(LogStatus.FAIL, "15. Expected message not shown: Test Fail");
	}
	
	*/
			//Close report
			Comman.extent002.endTest(Comman.extentTest002);
		
		
			//Writing everything to document.
			Comman.extent002.flush();
	
			
			//System.out.println("Reporting completed");
			driver.close();
				}
		
	}

