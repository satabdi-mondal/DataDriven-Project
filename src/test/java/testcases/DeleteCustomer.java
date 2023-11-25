package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepackage.TestBase;
import utility.ReadXLSdata;

public class DeleteCustomer extends TestBase {
	
	@Test (dataProviderClass = ReadXLSdata.class, dataProvider ="bvtdata")
	public void deleteCustomer(String firstname, String lastname, String postcode) {
		
		driver.findElement(By.cssSelector(OR.getProperty("DeleteCus_CSS"))).click();
        WebElement ele = driver.findElement(By.cssSelector(OR.getProperty("Search_name")));
        ele.sendKeys(postcode);
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath(OR.getProperty("delete_XPATH"))));
		driver.findElement(By.xpath(OR.getProperty("delete_XPATH"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("Search_name"))).clear();
		
		
	} 

}
