package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basepackage.TestBase;
import utility.ReadXLSdata;

public class Addaccount extends TestBase{
	
	@Test (dataProviderClass = ReadXLSdata.class, dataProvider ="bvtdata")
	public void addaccount(String firstname, String lastname, String postcode) {
		driver.findElement(By.cssSelector(OR.getProperty("openaccount_CSS"))).click();
		
		WebElement customer = 	driver.findElement(By.cssSelector(OR.getProperty("customer_CSS")));
		WebElement currency = driver.findElement(By.cssSelector(OR.getProperty("currency_CSS")));
		Select select = new Select(customer) ;
		Select select1 = new Select(currency) ;
		select.selectByVisibleText(firstname+" "+lastname);
	
		
		select1.selectByVisibleText(OR.getProperty("CurrencyType"));
		driver.findElement(By.cssSelector(OR.getProperty("process_CSS"))).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		}

}
