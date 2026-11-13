package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		WebDriver driver;
		//step 1
		@FindBy(id="ap_email_login")
		private WebElement UserName;
		
		@FindBy(id="continue")
		private WebElement ContinueButton;
		
		@FindBy(id="ap_password")
		private WebElement Password;
		
		@FindBy(id="signInSubmit")
		private WebElement Sign;
		
		@FindBy(xpath = "//div[@id='claim-collection-container']/h1")
		private WebElement signoutTitle;
		
		//step 2
		public void enterUserName() {
			UserName.sendKeys("abhishek2003d@gmail.com");
		}
		public void ClickOnContinubutton() {
			ContinueButton.click();
		}
		public void enterPassword() {
			Password.sendKeys("Abhishek##123");
		}
		public void ClickOnSignButton() {
			Sign.click();
		}
		
		public String VerifySignOut() {
			String title=signoutTitle.getText();
			return title;
		}
		//step 3
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
//		
}
