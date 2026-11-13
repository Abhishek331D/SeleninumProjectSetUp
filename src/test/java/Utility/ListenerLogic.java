package Utility;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerLogic implements ITestListener  {


	public static WebDriver driver;
	public void captureScreenShot(ITestResult result, String status) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination1 =new File("C:\\selenium\\SeleninumProjectSetUp\\test-output\\Screenshots\\"+status+"\\"+result.getName()+".png");
		try {
			FileHandler.copy(source,destination1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		captureScreenShot(result,"Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		captureScreenShot(result,"Fail");
	}

	

}
