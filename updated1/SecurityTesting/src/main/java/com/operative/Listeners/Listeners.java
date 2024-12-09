package com.operative.Listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.operative.Reports.Reports;
import com.operative.base.BaseTest;
import com.operative.utils.Log;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Listeners  extends BaseTest implements ITestListener {

	ExtentTest test;
	ExtentReports extent = Reports.getReport();

	@Override
	public void onTestStart(ITestResult result) {
		// Create a test in the Extent Report for each method
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		File zapReportFile = generateAndSaveZAPReport1(result);

		if (zapReportFile != null) {
		    // Add the ZAP report to the Extent report
		    test.info("ZAP Report attached for method: " + result.getMethod().getMethodName());

		    // Check the path and add the report to Extent as a clickable link (HTML report).
		    String reportPath = zapReportFile.getAbsolutePath();
		    test.info("ZAP Report can be viewed here: <a href='" + reportPath + "' target='_blank'>Click here to view ZAP report</a>");

		    // Alternatively, if you want to add the report as an embedded HTML content in the report:
		    try {
		        String reportContent = new String(Files.readAllBytes(zapReportFile.toPath()));
		        test.info("ZAP Report: " + reportContent);  // Display report content directly in Extent (use cautiously if it's large).
		    } catch (IOException e) {
		        e.printStackTrace();
		        Reporter.log("Error reading ZAP report file: " + e.getMessage());
		    }
		    
		    Reporter.log("ZAP report attached to Extent Report: " + reportPath);
		}


		try {
			String screenshotPath = new BaseTest().getScreenShot(result.getMethod().getMethodName(), BaseTest.driver);
			test.addScreenCaptureFromPath(screenshotPath);
		} catch (IOException e) {
			Log.info("Screenshot capture failed: " + e.getMessage());
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {

		test.log(Status.FAIL, result.getThrowable());

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver")
					.get(result.getInstance());
		} catch (Exception e) {

			e.printStackTrace();
		}
		String filePath = null;
		try {
			filePath = getScreenShot(result.getMethod().getMethodName(), driver);
		} catch (Exception e) {

			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());



		File zapReportFile = generateAndSaveZAPReport1(result);

		if (zapReportFile != null) {
		    // Add the ZAP report to the Extent report
		    test.info("ZAP Report attached for method: " + result.getMethod().getMethodName());

		    // Check the path and add the report to Extent as a clickable link (HTML report).
		    String reportPath = zapReportFile.getAbsolutePath();
		    test.info("ZAP Report can be viewed here: <a href='" + reportPath + "' target='_blank'>Click here to view ZAP report</a>");

		    // Alternatively, if you want to add the report as an embedded HTML content in the report:
		    try {
		        String reportContent = new String(Files.readAllBytes(zapReportFile.toPath()));
		        test.info("ZAP Report: " + reportContent);  // Display report content directly in Extent (use cautiously if it's large).
		    } catch (IOException e) {
		        e.printStackTrace();
		        Reporter.log("Error reading ZAP report file: " + e.getMessage());
		    }
		    
		    Reporter.log("ZAP report attached to Extent Report: " + reportPath);
		}

	}




	@Override
	public void onFinish(ITestContext context) {
		String zapReportPath = System.getProperty("user.dir") + "/zap-consolidated-report.html";
		String iframeHtml = "<iframe src='" + zapReportPath + "' width='100%' height='600px' frameborder='0'></iframe>";

		extent.createTest("ZAP Security Test Report")
		.info("ZAP Report embedded below:")
		.info("<html>" + iframeHtml + "</html>");


		extent.flush();
	}

}
