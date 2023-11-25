package htmlreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestExtentReports {

	public ExtentSparkReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void setReport()
	{
		htmlReporter = new ExtentSparkReporter("./test-output/html/extent.html");
		
		htmlReporter.config().setEncoding("utf-8");
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
