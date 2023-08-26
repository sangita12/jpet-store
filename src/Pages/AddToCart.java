package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.Cookie;


public class AddToCart {
	
	
	String expectedPage;
	String acutalPage;

	
	 public void addFishtoCart(WebDriver driver) {
		//Click on Fish Catalog
		
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")).click();
		System.out.println("8. Clicked on Fish category");
		Comman.extentTest.log(LogStatus.INFO, "8. Clicked on Fish category");
		
		
		// display a list of products within a category
		
		expectedPage = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("9. User is redirected to Fish Product page. Test Pass");
			Comman.extentTest.log(LogStatus.PASS,"9. User is redirected to Fish Product page. Test Pass");
		}else {
			System.out.println("9. User is not redirected to Fish Product page. Test Fail");
			Comman.extentTest.log(LogStatus.FAIL, "9. User is not redirected to Fish Product page. Test Fail");
		}
		
		// Select the Angelfish prouduct
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		System.out.println("10. Clicked on Product ID");
		Comman.extentTest.log(LogStatus.INFO,"10. Clicked on Product ID" );
		
		//Verify redirect to Items page
		
		expectedPage = "https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=FI-SW-01";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("11. User is redirected to list of Fish items and their prices. Test Pass");
			Comman.extentTest.log(LogStatus.PASS, "11. User is redirected to list of Fish items and their prices. Test Pass");
		}else {
			System.out.println("11. User is not redirected to list of Fish items and their prices. Test Fail");
			Comman.extentTest.log(LogStatus.FAIL, "11. User is not redirected to list of Fish items and their prices. Test Pass");
		}
		
		//Click on Add to Cart button
		
		WebElement addButton = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		addButton.click();
		System.out.println("12. Clicked on Add to Cart button");
		
		
		//Verify landed to Shoping cart page
		
		expectedPage ="https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-1";
		acutalPage = driver.getCurrentUrl();
	/*
		Assert.assertEquals(acutalPage, expectedPage);
		System.out.println("13. User is redirected to Shopping Cart page");
		Comman.extentTest.log(LogStatus.PASS, "13. User is r	s`Xedirected to Shopping Cart page");
		
		Assert.assertNotEquals(acutalPage, expectedPage);
		System.out.println("13. User is not redirected to Shopping Cart page");
		Comman.extentTest.log(LogStatus.FAIL, "13. User is not redirected to Shopping Cart page");
		
		*/
	
		expectedPage ="https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-1";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("13. User is redirected to Shopping Cart page");
			Comman.extentTest.log(LogStatus.PASS, "13. User is redirected to Shopping Cart page");
		}else {
			System.out.println("13. User is not redirected to Shopping Cart page");
			Comman.extentTest.log(LogStatus.FAIL, "13. User is not redirected to Shopping Cart page");
		}
	 }	

	 
	
	 
	public void addCatsToCart(WebDriver driver) throws Exception{
			
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[4]/img")).click();
		System.out.println("6. Clicked on Cats Category");
		Comman.extentTest002.log(LogStatus.INFO, "6. Clicked on Cats Category");

		// Get the JSESSIONID cookie
		Cookie jsessionCookie = driver.manage().getCookieNamed("JSESSIONID");
		// Store the JSESSIONID value for future use
		String jsessionIdValue = jsessionCookie.getValue();
		 //System.out.println(jsessionIdValue);
		
		// driver.manage().addCookie(jsessionCookie);
		expectedPage = "https://petstore.octoperf.com/actions/Catalog.action;jsessionid="+jsessionIdValue+"?viewCategory=&categoryId=CATS";
		//System.out.println(expectedPage);
		acutalPage = driver.getCurrentUrl();
		//System.out.println(acutalPage);
		if(expectedPage.equals(acutalPage)) {
			System.out.println("7. User is redirected to Cats Product page. Test Pass");
			Comman.extentTest002.log(LogStatus.PASS, "7. User is redirected to Cats Product page. Test Pass");
		}else {
			System.out.println("7. User is not redirected to Cats Product page. Test Fail");
			Comman.extentTest002.log(LogStatus.FAIL, "7. User is not redirected to Cats Product page. Test Fail");
			
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		System.out.println("8. Clicked on Cats Product ID");
		Comman.extentTest002.log(LogStatus.INFO, "8. Clicked on Cats Product ID");
		
		//Verify redirect to Items page
		expectedPage = "https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=FL-DSH-01";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("9. User is redirected to list of Cats items and their prices. Test Pass");
			Comman.extentTest002.log(LogStatus.PASS, "9. User is Cats to list of Reptiles items and their prices. Test Pass");
		}else {
			System.out.println("9. User is not redirected to list of Cats items and their prices. Test Fail");
			Comman.extentTest002.log(LogStatus.FAIL, "9. User is not redirected to list of Cats items and their prices. Test Fail");
		}
		
		//Click on Add to cart
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();		
		System.out.println("10. Clicked on Add to Cart button");
		Comman.extentTest002.log(LogStatus.INFO, "10. Clicked on Add to Cart button");
		
		//Verify redirected to Shopping page
		expectedPage ="https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-14";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("11. User is redirected to Shopping Cart page");
			Comman.extentTest002.log(LogStatus.PASS, "11. User is redirected to Shopping Cart page");
		}else {
			System.out.println("11. User is not redirected to Shopping Cart page");
			Comman.extentTest002.log(LogStatus.FAIL, "11. User is not redirected to Shopping Cart page");
		}
		
		
		
		//Click on proceed to checkoutbutton
		
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
		System.out.println("13. Clicked on Proceed to Checkout");
		Comman.extentTest002.log(LogStatus.INFO, "13. Clicked on Proceed to Checkout");
		
		//VERIFY REDIRECT TO SIGNIN page
		
		expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
		acutalPage = driver.getCurrentUrl();
		
		if(expectedPage.equals(acutalPage)) {
			System.out.println("14. User is redirected to SignIn page");
			Comman.extentTest002.log(LogStatus.PASS, "14. User is redirected to SignIn page");
		}else {
			System.out.println("14. User is not redirected to SignIn page");
			Comman.extentTest002.log(LogStatus.PASS, "14. User is not redirected to SignIn page");
		}
	}
	
	

	
	public void addFishtoCart003(WebDriver driver) {
		//Click on Fish Catalog
		
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")).click();
		System.out.println("8. Clicked on Fish category");
		Comman.extentTest.log(LogStatus.INFO, "8. Clicked on Fish category");
		
		
		// display a list of products within a category
		
		expectedPage = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("9. User is redirected to Fish Product page. Test Pass");
			Comman.extentTest.log(LogStatus.PASS,"9. User is redirected to Fish Product page. Test Pass");
		}else {
			System.out.println("9. User is not redirected to Fish Product page. Test Fail");
			Comman.extentTest.log(LogStatus.FAIL, "9. User is not redirected to Fish Product page. Test Fail");
		}
		
		// Select the Angelfish prouduct
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		System.out.println("10. Clicked on Product ID");
		Comman.extentTest.log(LogStatus.INFO,"10. Clicked on Product ID" );
		
		//Verify redirect to Items page
		
		expectedPage = "https://petstore.octoperf.com/actions/Catalog.action?viewProduct=&productId=FI-SW-01";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("11. User is redirected to list of Fish items and their prices. Test Pass");
			Comman.extentTest.log(LogStatus.PASS, "11. User is redirected to list of Fish items and their prices. Test Pass");
		}else {
			System.out.println("11. User is not redirected to list of Fish items and their prices. Test Fail");
			Comman.extentTest.log(LogStatus.FAIL, "11. User is not redirected to list of Fish items and their prices. Test Pass");
		}
		
		//Click on Add to Cart button
		
		WebElement addButton = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		addButton.click();
		System.out.println("12. Clicked on Add to Cart button");
		
		
		//Verify landed to Shoping cart page
		
		expectedPage ="https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-1";
		acutalPage = driver.getCurrentUrl();
	/*
		Assert.assertEquals(acutalPage, expectedPage);
		System.out.println("13. User is redirected to Shopping Cart page");
		Comman.extentTest.log(LogStatus.PASS, "13. User is r	s`Xedirected to Shopping Cart page");
		
		Assert.assertNotEquals(acutalPage, expectedPage);
		System.out.println("13. User is not redirected to Shopping Cart page");
		Comman.extentTest.log(LogStatus.FAIL, "13. User is not redirected to Shopping Cart page");
		
		*/
	
		expectedPage ="https://petstore.octoperf.com/actions/Cart.action?addItemToCart=&workingItemId=EST-1";
		acutalPage = driver.getCurrentUrl();
		if(expectedPage.equals(acutalPage)) {
			System.out.println("13. User is redirected to Shopping Cart page");
			Comman.extentTest.log(LogStatus.PASS, "13. User is redirected to Shopping Cart page");
		}else {
			System.out.println("13. User is not redirected to Shopping Cart page");
			Comman.extentTest.log(LogStatus.FAIL, "13. User is not redirected to Shopping Cart page");
		}
	 }	

	
	
	
}
