package com.ecommerce_app.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtilities {
	static String projectpath=System.getProperty("user.dir")  ;
	public static String capturescreen(WebDriver driver, String TestName) throws IOException
	{
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String screenDir = projectpath + "\\src\\test\\resources\\Ecommerce_app_Screenshots\\";
		 File dir = new File(screenDir);
		 String screenpath= screenDir + TestName + ".png";
	     File dest=new File(screenpath);
		 FileUtils.copyFile(src, dest);
		 return screenpath;
	}
}
