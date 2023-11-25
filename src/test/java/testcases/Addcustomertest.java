package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basepackage.TestBase;
import utility.ReadXLSdata;






public class Addcustomertest extends TestBase {
	

@Test (dataProviderClass = ReadXLSdata.class, dataProvider ="bvtdata")
public void LoginTest(String firstname, String lastname, String postcode, String alerttext, String runmode)	{

	driver.findElement(By.cssSelector(OR.getProperty("addCustBtn_CSS"))).click();
	driver.findElement(By.cssSelector(OR.getProperty("firstname_CSS"))).sendKeys(firstname);
	driver.findElement(By.xpath(OR.getProperty("lastname_XPATH"))).sendKeys(lastname);
	driver.findElement(By.cssSelector(OR.getProperty("postcode_CSS"))).sendKeys(postcode);
	driver.findElement(By.cssSelector(OR.getProperty("addbtn_CSS"))).click();
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();

}


}