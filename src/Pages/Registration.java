package Pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {
		public void reg(WebDriver driver) throws Exception {
				//Click on Signing
				driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
				System.out.println("3. Click on Sign in link");
				
				// Click on Register Now! link
				driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
				System.out.println("4. Click on Register Now! link");
				
				// Registration
				
				Random userName = new Random();
				
				int x = userName.nextInt(100);
				
				 Comman.uname = "AutoUser"+x;
				
				driver.findElement(By.name("username")).clear();
				driver.findElement(By.name("username")).sendKeys(Comman.uname);
				
				driver.findElement(By.name("password")).clear();
				driver.findElement(By.name("password")).sendKeys(Comman.password);
				
				driver.findElement(By.name("repeatedPassword")).clear();
				driver.findElement(By.name("repeatedPassword")).sendKeys(Comman.password);
				
				String values[] = {"Auto", "Test", "autotest@gmail.com","9856321456","Butwal devinagar","Butwal devinagar", "Butwal","Butwal","12345","Neapl"};
				for(int i=0; i <10; i++) {				
					driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr["+(i+1)+"]/td[2]/input")).sendKeys(values[i]);
					//System.out.println("i:"+i);
					//System.out.println("values[]:"+values[i]);		
				}
				// Drop down
					
				Select drpLang = new Select(driver.findElement(By.name("account.languagePreference")));
				drpLang.selectByValue("japanese");
				Select drpCategory = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
				drpCategory.selectByValue("DOGS");
				
				//Check Box
				
				WebElement myList = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input"));
				myList.click();
				
				WebElement myBanner = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input"));
				myBanner.click();
				
				driver.findElement(By.name("newAccount")).click();
				//Verify User registered
				
				String expectedURL = "https://petstore.octoperf.com/actions/Catalog.action";
				String actualURL = driver.getCurrentUrl();
				
				//Screenshot shot = new Screenshot();
				
				if(expectedURL.equals(actualURL)){
						System.out.println("User successfully regsitered:" + Comman.uname);
						//shot.takeSnapShot(driver, "C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj\\src\\ScreenShot\\Test.jpg");
				//Comman.takeSnapShot(driver, "C:\\Users\\Owner\\eclipse-workspace\\JpetStore_SeleniumProj\\src\\ScreenShot\\Test.jpg");
				// Take screenshot and attach image in Report
						
				}else {
						System.out.println("User registration failed");					
				
				}
				
		}
}
				