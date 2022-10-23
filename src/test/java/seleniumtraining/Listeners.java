package seleniumtraining;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNG;
import resources.base;

public class Listeners extends base implements ITestListener {

	ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();
	
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {
		
	test=extent.createTest(result.getMethod().getMethodName());	
	extenttest.set(test);
	
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		extenttest.get().log(Status.PASS, "Test PASS");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		extenttest.get().fail(result.getThrowable());
		
		WebDriver driver=null;
		String testMethodName=result.getMethod().getMethodName();
				
     try {
		driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch(Exception e)
     {
     
     }
     
		
	      try {
	    	  extenttest.get().addScreenCaptureFromPath(getScreenShotPath(testMethodName , driver), result.getMethod().getMethodName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		extent.flush();
	}

}
