package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AddToCart;
import Pages.Comman;
import Pages.Order;
import Pages.SignIn;

public class Order_TC_004 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome", "C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj\\src\\Driver\\chromedriver.exe");
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
				
				driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();
				System.out.println("4. Clicked on Enter the Store Link");
//				test.log(LogStatus.INFO, "4. Clicked on Enter the Store Link");
				
				// Verify redirect to Catalog page
				expectedURL = "https://petstore.octoperf.com/actions/Catalog.action";
				actualURL = driver.getCurrentUrl();
				if(expectedURL.equals(actualURL)) {
					System.out.println("5. User is redirected to Catalog Page. Test Pass");
			//		test.log(LogStatus.PASS, "5. User is redirected to Catalog Page. Test Pass");
				}else {
					System.out.println("5. User is not redirected to Catalog Page. Test Fail");
				//	test.log(LogStatus.FAIL, "5. User is not redirected to Catalog Page. Test Fail");
				}
				
				//Registration obj2 = new Registration();
				//obj2.reg(driver);
				
				Comman.uname = "AutoUser89";
				
				SignIn obj1 =  new SignIn();
				obj1.PositiveLoginTest(driver);
				
				AddToCart obj3 = new AddToCart();
				obj3.addFishtoCart003(driver);
				
				Order obj4 = new Order();
				obj4.updateShippingAddress(driver);
				
				driver.close();
			

	}

}
