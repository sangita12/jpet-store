package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchCatalog {
	public void search(WebDriver driver){
		WebElement searchBar = driver.findElement(By.name("keyword"));
		searchBar.clear();
		searchBar.sendKeys("fish");
		driver.findElement(By.name("searchProducts")).click();
}
}
