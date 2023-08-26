
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import dev.failsafe.internal.util.Assert;
//import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class Order {
	
	String expectedPage, expectedText;
	String actualPage, actualText;
	
	public void PostiveOrderTest(WebDriver driver) {
		//Click on Proceed to checkout
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
		
		//Verify the confirm Billing page
		 expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
		 actualPage = driver.getCurrentUrl();
		if(expectedPage.equals(actualPage)) {
			System.out.println("14. User is redirected to Billing Page: Test Pass");
		//	Comman.extentTest.log(LogStatus.PASS, "14. User is redirected to Billing Page: Test Pass");
		}else {
			System.out.println("14. User is not redirected to Billing Page: Test Fail");
		//	Comman.extentTest.log(LogStatus.FAIL, "14. User is not redirected to Billing Page: Test Fail");
		}
		
		//Click on Continue
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		
		expectedPage = "https://petstore.octoperf.com/actions/Order.action";
		 actualPage = driver.getCurrentUrl();
		if(expectedPage.equals(actualPage)) {
			System.out.println("15. User is redirected to Order Confirmation Page: Test Pass");
		//	Comman.extentTest.log(LogStatus.PASS, "15. User is redirected to Order Confirmation Page: Test Pass");
		}else {
			System.out.println("15. User is not redirected to Order Confirmation Page: Test Fail");
		//	Comman.extentTest.log(LogStatus.FAIL, "15. User is not redirected to Order Confirmation Page: Test Fail");
		}
		
		//Click on Confirm button
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		
		expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrder=&confirmed=true";
		 actualPage = driver.getCurrentUrl();
		if(expectedPage.equals(actualPage)) {
			System.out.println("16. User is redirected to Order Submited Page: Test Pass");
		//	Comman.extentTest.log(LogStatus.PASS, "15. User is redirected to Order Submite Page: Test Pass");
		}else {
			System.out.println("16. User is not redirected to Order Submited Page: Test Fail");
		//	Comman.extentTest.log(LogStatus.FAIL, "15. User is not redirected to Order Submmite Page: Test Fail");
		}
		
		
	}
	
	public void updateDetails(WebDriver driver) {
		//Click on Proceed to checkout
				driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
				
				//Verify the confirm Billing page
				 expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
				 actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("14. User is redirected to Billing Page: Test Pass");
				//	Comman.extentTest.log(LogStatus.PASS, "14. User is redirected to Billing Page: Test Pass");
				}else {
					System.out.println("14. User is not redirected to Billing Page: Test Fail");
				//	Comman.extentTest.log(LogStatus.FAIL, "14. User is not redirected to Billing Page: Test Fail");
				}
				 //Update the Payment Details
				
				//Select the Card Type
				
				Select dropCardType = new Select(driver.findElement(By.name("order.cardType")));
				dropCardType.selectByVisibleText("MasterCard");
				System.out.println("15. Select the Card Type as MasterCard");
				
				// Update card number
				
				WebElement card = driver.findElement(By.name("order.creditCard"));
				card.clear();
				card.sendKeys("4005519200000004");				
				System.out.println("15. Entered the CardNumber");
				
				WebElement expiryDate = driver.findElement(By.name("order.expiryDate"));
				expiryDate.clear();
				expiryDate.sendKeys("12/26");
				System.out.println("16. Enter the Expiry Date");
				
				WebElement firstName = driver.findElement(By.name("order.billToFirstName"));
				firstName.clear();
				firstName.sendKeys("AutoUpdate");
				System.out.println("17. Enter the FirstName");
				
				WebElement lastName = driver.findElement(By.name("order.billToLastName"));
				lastName.clear();
				lastName.sendKeys("TestUpdate");
				System.out.println("18. Enter the LastName");
				
				WebElement address1 = driver.findElement(By.name("order.billAddress1"));
				address1.clear();
				address1.sendKeys("KTM");
				System.out.println("19. Enter the Address1");
				
				WebElement address2 = driver.findElement(By.name("order.billAddress2"));
				address2.clear();
				address2.sendKeys("Butwal");
				System.out.println("20. Enter the Address2");
				
				WebElement city = driver.findElement(By.name("order.billCity"));
				city.clear();
				city.sendKeys("Devinagar");
				System.out.println("20. Enter the City");
				
				WebElement state = driver.findElement(By.name("order.billState"));
				state.clear();
				state.sendKeys("Butwal");
				System.out.println("21. Enter the State");
				
				WebElement zip = driver.findElement(By.name("order.billZip"));
				zip.clear();
				zip.sendKeys("11111");
				System.out.println("22. Enter the ZipCode");
				
				WebElement country = driver.findElement(By.name("order.billCountry"));
				country.clear();
				country.sendKeys("Nepal");
				System.out.println("23. Enter the Country");
				
				
				//Click on Continue button
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
				System.out.println("24. Clicked on Continue button");
				
				expectedPage = "https://petstore.octoperf.com/actions/Order.action";
				actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("25. User is redirected to the Confirm information page");
					}else {
						System.out.println("25. User is not redirected to the Confirm information page");
					}
				
				//Click on Confirm button
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
				System.out.println("26. Clicked on Confirm button");
				
				expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrder=&confirmed=true";
				actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("27. User is redirected to the Confirm information page");
				}else {
					System.out.println("27. User is not redirected to the Confirm information page");
				}
	}		
				
			public void updateShippingAddress(WebDriver driver) {
				//Click on Proceed to checkout
				driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
				
				//Verify the confirm Billing page
				 expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
				 actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("14. User is redirected to Billing Page: Test Pass");
				//	Comman.extentTest.log(LogStatus.PASS, "14. User is redirected to Billing Page: Test Pass");
				}else {
					System.out.println("14. User is not redirected to Billing Page: Test Fail");
				//	Comman.extentTest.log(LogStatus.FAIL, "14. User is not redirected to Billing Page: Test Fail");
				}
				
				//Select checkbox to add new Ship address
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table/tbody/tr[14]/td/input")).click();
				System.out.println("15. Clicked on Ship to different address... check box ");
				
				//Click on Continue button
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
				System.out.println("16. Clicked on Continue button");
				
				expectedPage = "https://petstore.octoperf.com/actions/Order.action";
				actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("17. User is redirected to the Confirm information page");
					}else {
						System.out.println("17. User is not redirected to the Confirm information page");
					}
				
	
				expectedPage = "https://petstore.octoperf.com/actions/Order.action";
				actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("18. User is redirected to the Shipping Address page");
				}else {
					System.out.println("18. User is not redirected to the Shipping Address page");
				}
				
				//Enter the new shipping address
				driver.findElement(By.name("order.shipToFirstName")).sendKeys("Ship First Name");
				System.out.println("19. Enter the First Name");
				driver.findElement(By.name("order.shipToLastName")).sendKeys("Ship Last Name");
				System.out.println("20. Enter the Last Name");
				driver.findElement(By.name("order.shipAddress1")).sendKeys("Ship Address1");
				System.out.println("21. Enter the Address 1");
				driver.findElement(By.name("order.shipAddress2")).sendKeys("Ship Address2");
				System.out.println("22. Enter the Address 2");
				driver.findElement(By.name("order.shipCity")).sendKeys("Ship City");
				System.out.println("23. Enter the City");
				driver.findElement(By.name("order.shipState")).sendKeys("Ship State");
				System.out.println("24. Enter the State");
				driver.findElement(By.name("order.shipZip")).sendKeys("Ship Zip");
				System.out.println("25. Enter the Zip");
				driver.findElement(By.name("order.shipCountry")).sendKeys("Ship Country");
				System.out.println("26. Enter the Country");
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
				System.out.println("27. Clicked on Conitune button");
				
				//Vere
				 
				expectedPage = "https://petstore.octoperf.com/actions/Order.action";
				actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("28. User is redirected to the Confirm information page");
					}else {
						System.out.println("28. User is not redirected to the Confirm information page");
					}
				
	//Click on Confirm button
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
				System.out.println("29. Clicked on Confirm button");
				
				expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrder=&confirmed=true";
				actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("30. User is redirected to the Confirm information page");
				}else {
					System.out.println("30. User is not redirected to the Confirm information page");
				}
				
				expectedText = "Thank you, your order has been submitted.";
				WebElement ele = driver.findElement(By.xpath("//*[@id=\"Content\"]/ul/li"));
				actualText = ele.getText();
				

				if(expectedText.equals(actualText))
				{
					System.out.println("31. Order Submitted message shown: Test Pass");
					//Comman.extentTest002.log(LogStatus.PASS, "15. Expected message shown: Test Pass");
				}else {
					System.out.println("31. Order Submitted message not shown: Test Fail");
					//Comman.extentTest002.log(LogStatus.FAIL, "15. Expected message not shown: Test Fail");
				}
							
				System.out.println("32. "+ actualText);
							
			}			
	
			public void missingInfo(WebDriver driver) {
				//Click on Proceed to checkout
				driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
				
				//Verify the confirm Billing page
				 expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
				 actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("14. User is redirected to Billing Page: Test Pass");
				//	Comman.extentTest.log(LogStatus.PASS, "14. User is redirected to Billing Page: Test Pass");
				}else {
					System.out.println("14. User is not redirected to Billing Page: Test Fail");
				//	Comman.extentTest.log(LogStatus.FAIL, "14. User is not redirected to Billing Page: Test Fail");
				}
				
				//Clear the Payment details data
				
				driver.findElement(By.name("order.creditCard")).clear();
				System.out.println("15. Delete the Card Number");
				driver.findElement(By.name("order.expiryDate")).clear();
				System.out.println("16. Delete the Expiry Date");
				
				//Click on Contiune button
				
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
				System.out.println("17. Clicked on Continue button");
				
				}
			
			public void negativeCase(WebDriver driver) {
				
				//Click on Proceed to checkout
				driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
				
				//Verify the confirm Billing page
				 expectedPage = "https://petstore.octoperf.com/actions/Order.action?newOrderForm=";
				 actualPage = driver.getCurrentUrl();
				if(expectedPage.equals(actualPage)) {
					System.out.println("14. User is redirected to Billing Page: Test Pass");
				//	Comman.extentTest.log(LogStatus.PASS, "14. User is redirected to Billing Page: Test Pass");
				}else {
					System.out.println("14. User is not redirected to Billing Page: Test Fail");
				//	Comman.extentTest.log(LogStatus.FAIL, "14. User is not redirected to Billing Page: Test Fail");
				}
				
				 // Find the cardnumber and expiry date input fields
				WebElement cardNumber = driver.findElement(By.name("order.creditCard"));
				WebElement expiryDate = driver.findElement(By.name("order.expiryDate"));
				
				WebElement button = driver.findElement(By.name("newOrder"));
				// Test case 1: Empty string case
				
				cardNumber.clear();
				expiryDate.clear();
				button.click();
				
				// Check if an error message is displayed for empty information
				
				
				
			}

}
