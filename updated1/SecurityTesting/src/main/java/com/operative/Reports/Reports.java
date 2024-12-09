package com.operative.Reports;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {

	public static ExtentReports getReport()
	{
		ExtentReports extent=new ExtentReports();
			
			String filepath=System.getProperty("user.dir")+"//Reports//index"+timeStamp()+".html";
			
			ExtentSparkReporter spark=new ExtentSparkReporter(filepath);
			spark.config().setDocumentTitle("ZAP Report");
			spark.config().setReportName("Operative Perf Team");
			spark.config().setTheme(Theme.DARK);
			spark.config().setTimeStampFormat("DD/MM?YYY");
			extent.attachReporter(spark);
		
			extent.setSystemInfo("Application", "AOS");
			extent.setSystemInfo("OS", "Windows");
			extent.setSystemInfo("Programming Language", "Java");
			
			return extent;
	}
	public static String timeStamp()
	{
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
		String time=now.format(formatter);
		return time;
	}
}
