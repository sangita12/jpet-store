package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class SignIn {
	public void PositiveLoginTest(WebDriver driver) throws Exception{
	
		//String firstname = "Auto";
		
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		System.out.println("6. Clicked on SignIn link");
		//Comman.extentTest.log(LogStatus.INFO, "6. Clicked on SignIn link");
		
		WebElement name = driver.findElement(By.name("username"));
		name.clear();
		name.sendKeys(Comman.uname);
		
		WebElement passwd = driver.findElement(By.name("password"));
		passwd.clear();
		passwd.sendKeys(Comman.password);
		//passwd.sendKeys("Test@123");
		
		//Click on Login button
		driver.findElement(By.name("signon")).click();
		//System.out.println("Login successfully as a :"+ Comman.uname);
		
		//Verify login successful or not		
		
		String expectedURl = "https://petstore.octoperf.com/actions/Catalog.action";
		String actualURL = driver.getCurrentUrl();
		if(expectedURl.equals(actualURL)) {
			System.out.println("7. Logined in successfully: Test Pass");
		//	Comman.extentTest.log(LogStatus.PASS, "7. Logined in successfully: Test Pass");
		//	Comman.extentTest.log(LogStatus.INFO, "Pass Snapshot : "+ Comman.extentTest.addScreenCapture(Comman.extentReportImage));
			
		}else {
			System.out.println("7. Logined in failed: Test Fail");
		//	Comman.extentTest.log(LogStatus.FAIL, "7. Logined in failed: Test Fail");
		//	Comman.extentTest.log(LogStatus.INFO,"Error Snapshot : "+ Comman.extentTest.addScreenCapture(Comman.extentReportImage));
		}
		
		
	}

}
