package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepackage.TestBase;
import junit.framework.Assert;
import utility.ReadXLSdata;

public class CustomerLogin extends TestBase {
	
	@Test (dataProviderClass = ReadXLSdata.class, dataProvider ="bvtdata")
	public void Cutomerlogin(String firstname, String lastname, String postcode) {
		driver.findElement(By.xpath(OR.getProperty("home_button"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("CustomerLogin_CSS"))).click();
		WebElement name =driver.findElement(By.cssSelector(OR.getProperty("name_dropdown")));
		Select select = new Select(name);
		select.selectByVisibleText(firstname+" "+lastname);
		driver.findElement(By.xpath(OR.getProperty("loginButton"))).click();
		
		//depositing amount in customer account
		driver.findElement(By.cssSelector(OR.getProperty("depositButton"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("AmountButton"))).sendKeys(OR.getProperty("Amount"));
		driver.findElement(By.xpath(OR.getProperty("DepositButton"))).click();
		
		//verifying deposit message
		
		WebElement Verifymessage= driver.findElement(By.cssSelector(OR.getProperty("verifyMessage")));
		System.out.println(Verifymessage.getText());
		String actual = Verifymessage.getText();
		String expected = "Deposit Successful";
		Assert.assertEquals(actual, expected);
		
		//verifying deposit amount
		
	   WebElement Balance = driver.findElement(By.xpath(OR.getProperty("amountverify")));
	   String actualamount = Balance.getText();
	   String expectedamount = OR.getProperty("Amount");
	   Assert.assertEquals(actualamount, expectedamount);
	   
	   //Withdrawing amount from customer account
	   driver.findElement(By.cssSelector(OR.getProperty("Withdrawlbutton"))).click();
	   driver.findElement(By.cssSelector(OR.getProperty("AmountToBeWithdrawButton"))).sendKeys(OR.getProperty("amounttobewithdrawn"));
	   driver.findElement(By.xpath(OR.getProperty("Withdrawbutton"))).click();
	   
	
	  
		
		 

		
	}
	

}
