package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Pages.AddToCart;
import Pages.Comman;
import Pages.Order;
import Pages.Registration;
//import Pages.Registration;
//import Pages.SearchCatalog;
import Pages.SignIn;

public class Order_TC_001 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		
		System.setProperty("webdriver.chrome", "C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("1. Browser opened successfully");	
		Comman.extentTest.log(LogStatus.INFO, "1. Broswer opened successfully");	
		
		
		String expectedURL = "https://petstore.octoperf.com/";
		driver.get(expectedURL);
		System.out.println("2. Entered the URL");
		Comman.extentTest.log(LogStatus.INFO, "2. Entered the URL");
		
		String actualURL = driver.getCurrentUrl();
		if(expectedURL.equals(actualURL)) {
			System.out.println("3. Verified the application opened successfully");	
			Comman.extentTest.log(LogStatus.PASS, "3. Verified the application opened successfully");
		}
		else {
			System.out.println("3. Verified the application opened failed");
			Comman.extentTest.log(LogStatus.FAIL, "3. Verified the application opened failed");
		}
		driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();
		System.out.println("4. Clicked on Enter the Store link");
		Comman.extentTest.log(LogStatus.INFO, "4. Clicked on Enter the Store link");
		
		// Verify redirect to Catalog page
		
		String expectedURL1 = "https://petstore.octoperf.com/actions/Catalog.action";
		String actualURL1 = driver.getCurrentUrl();
		if(expectedURL1.equals(actualURL1)) {
			System.out.println("5. User is redirected to Catalog Page. Test Pass");
			Comman.extentTest.log(LogStatus.PASS, "5. User is redirected to Catalog Page. Test Pass");
		}else {
			System.out.println("5. User is not redirected to Catalog Page. Test Fail");
			Comman.extentTest.log(LogStatus.FAIL, "5. User is not redirected to Catalog Page. Test Fail");
		}
		
		
		// Call class Registration
//	Registration regi = new Registration();
	//	regi.reg(driver); 
		
		
		// Call class Signing
		Comman.uname = "AutoUser88";
		
		SignIn sin = new SignIn();
		sin.PositiveLoginTest(driver);
		
		//Call class Search
		//SearchCatalog pet = new SearchCatalog();
		//pet.search(driver);
		
		//Call AddToCart class
		AddToCart add = new AddToCart();
		add.addFishtoCart(driver);
		
	/*	//Call Order class
		Order ord = new Order();
		ord.PostiveOrderTest(driver);
		
		*/
		//Close report
		Comman.extent.endTest(Comman.extentTest);
			
		//Writing everything to document.
		Comman.extent.flush();
		
		//System.out.println("Reproting completed");
		driver.close();
		
		
		
		
	}

}
