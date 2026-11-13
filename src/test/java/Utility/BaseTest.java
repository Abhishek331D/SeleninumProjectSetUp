package Utility;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest extends ListenerLogic {
	
	
	
	@Parameters("Browser")
	@BeforeMethod
	public void SelectBrowse(String NameOfBrowser) throws InterruptedException {
		if(NameOfBrowser.equals("Edge")) {
			driver=new EdgeDriver();
			Thread.sleep(2000);
			driver.get("https://www.amazon.in");
			
		}
		if(NameOfBrowser.equals("Chrome")) {
			driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.amazon.in");
		}
		if(NameOfBrowser.equals("Firefox")) {
			
			driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.get("https://www.amazon.in");
		}
	}
	@AfterMethod
	public void QuitBrowse() throws InterruptedException {
		Thread.sleep(3000);
//		driver.quit();
		
	}
	

}
