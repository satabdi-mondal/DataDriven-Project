package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;



import basepackage.TestBase;

public class LoginTest extends TestBase {
	@Test(priority =1)
	public void LoginAsBankManager() {
		
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn_CSS"))).click();
		
		
	}
/*	
	@Test (priority =2)
	public void addcustomer()	{

		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn_CSS"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstname_CSS"))).sendKeys("Satabdi");
		driver.findElement(By.xpath(OR.getProperty("lastname_XPATH"))).sendKeys("Mandal");;
		driver.findElement(By.cssSelector(OR.getProperty("postcode_CSS"))).sendKeys("4056");;
		driver.findElement(By.cssSelector(OR.getProperty("addbtn_CSS"))).click();
		Reporter.log("Test successfully executed");
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
	@Test (priority =3)
	public void addaccount() {
	driver.findElement(By.cssSelector(OR.getProperty("openaccount_CSS"))).click();
	
	WebElement customer = 	driver.findElement(By.cssSelector(OR.getProperty("customer_CSS")));
	WebElement currency = driver.findElement(By.cssSelector(OR.getProperty("currency_CSS")));
	Select select = new Select(customer) ;
	select.selectByVisibleText("Satabdi Mandal");
	Select select1 = new Select(currency) ;
	select1.selectByVisibleText("Rupee");
	driver.findElement(By.cssSelector(OR.getProperty("process_CSS"))).click();
	Alert alert1 = driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	
	}
	@Test(priority =4)
	public void deleteCustomer() {
		driver.findElement(By.cssSelector(OR.getProperty("DeleteCus_CSS"))).click();
		driver.findElement(By.xpath(OR.getProperty("delete_XPATH"))).click();
		
	} */
}
