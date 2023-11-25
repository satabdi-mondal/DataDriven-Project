package rough;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Extentreportdemo {
	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest extenttest;
	
	
  @Test
  public void testmethod() {
	extenttest =  extent.createTest("Login Test");
	extenttest.log(Status.INFO,"entering username");
	extenttest.log(Status.INFO,"entering password");

  }
  @Test
  public void failedMethod() {
	  extenttest =  extent.createTest("Login Test");
		extenttest.log(Status.INFO,"entering username");
		extenttest.log(Status.INFO,"entering password");
	Assert.fail();
  }
  @Test
  public void skipedMethod() {
	  extenttest =  extent.createTest("Skiped Test");
		extenttest.log(Status.INFO,"entering username");
		extenttest.log(Status.INFO,"entering password");
		throw new SkipException("skip the test");
  }

  @BeforeTest
  public void beforeClass() {
	  htmlReporter = new ExtentSparkReporter(".//test-output//html//extentreport.html");
	   htmlReporter.config().setTheme(Theme.STANDARD);
       htmlReporter.config().setDocumentTitle("Datadriven Project Report");
       htmlReporter.config().setEncoding("utf-8");
       htmlReporter.config().setReportName("Extent Report");
       
       extent = new ExtentReports();
       extent.attachReporter(htmlReporter);
       extent.setSystemInfo("Automation Tester", "Satabdi Mandal");
       extent.setSystemInfo("Organization", "Satabdi's Class");
       extent.setSystemInfo("Build no", "2023");
  }
  
  @AfterMethod
  public void updateResults (ITestResult result) {
	  if(result.getStatus()==ITestResult.FAILURE) {
		  extenttest.fail("Failing the test");
	  }
	  else if(result.getStatus()==ITestResult.SUCCESS) {
		  extenttest.pass("passed the test");
	  }
	  else if(result.getStatus()==ITestResult.SKIP) {
		  extenttest.skip("skiping the test");
	  }
  }

  @AfterTest
  public void afterClass() {
	  
	  extent.flush();
  }

}
