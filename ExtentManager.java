package com.ecommerce_app.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extent;
	static String projectpath=System.getProperty("user.dir");
	public static ExtentReports getinstance()
	
	{
		
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter(projectpath+"\\src\\test\\resources\\Ecommerce_app_Reports\\s1.html");
		extent.attachReporter(spark);
		return extent;
		
		
	}
}
