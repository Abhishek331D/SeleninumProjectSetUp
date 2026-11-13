package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class HomePage {
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	private WebElement AccountAndList;
	
	@FindBy(xpath="//a[@class='nav-action-signin-button']")
	private WebElement Sign;
	
	@FindBy(xpath = "//span[text()='Sign Out']")
	private WebElement signout;
	
	//step 2
	public void hoverOverAccAndList(WebDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(AccountAndList).perform();
	}
	public void ClickSignbutton() {
		Sign.click();
	}
	
	public void ClickSignOutbutton() {
		signout.click();
	}
	
	//step 3
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
