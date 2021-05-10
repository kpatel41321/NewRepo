package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;

public class CredentialsPage extends Testbase {

	@FindBy(name="email")
	WebElement userName;

	@FindBy(name="password")
	WebElement passWord;

	@FindBy(xpath ="//div[contains(@class,'ui fluid large blue submit button')]")
	WebElement login2Button;

	public CredentialsPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateCredentialsPage() {
		return driver.getTitle();
	}
	public HomePage login(String un,String pwd) {
		userName.sendKeys(un);
		passWord.sendKeys(pwd);
		login2Button.click();
		return new HomePage();
	}
}
