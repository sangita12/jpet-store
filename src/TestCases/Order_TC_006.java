package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Pages.AddToCart;
import Pages.Comman;
import Pages.ExtentManager;
import Pages.Order;
import Pages.SignIn;

public class Order_TC_006 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		 ExtentReports extent;
		 ExtentTest test;
		 
		 extent = ExtentManager.getInstance();
		 test = extent.startTest("Test case 6", false);
	    		
		System.setProperty("Webdriver.chrome","C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 System.out.println("1. Browser opened successfully");
			//	test.log(LogStatus.INFO, "1. Browser opened successfully");
				
				
				String expectedURL = "https://petstore.octoperf.com/";
				driver.get(expectedURL);		// Navigate to expectedURL
				System.out.println("2. Entered the URL");
			//	test.log(LogStatus.INFO, "2. Entered the URL");
			
				String actualURL = driver.getCurrentUrl();
				if(expectedURL.equals(actualURL))
				{
					System.out.println("3. Verified the application opened successfully");
				//	test.log(LogStatus.PASS, "3. Verified the application opened successfully");
				}else {
					System.out.println("3. Verified the application opened failed");
				//	test.log(LogStatus.FAIL, "3. Verified the application opened failed");
				}
				
				Comman.uname = "AutoUser89";
				
				SignIn obj1 =  new SignIn();
				obj1.PositiveLoginTest(driver);
				
				AddToCart obj3 = new AddToCart();
				obj3.addFishtoCart003(driver);
				
				Order obj4 = new Order();
				obj4.missingInfo(driver);
				
	}

}
