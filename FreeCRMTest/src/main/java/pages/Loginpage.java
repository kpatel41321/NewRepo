package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Testbase;


public class Loginpage extends Testbase {
	
	@FindBy(xpath="(//a[contains(@class,'btn')])[1]")
	WebElement loginButton;

	@FindBy(xpath="//span[contains(@class,'mdi-chart-bar icon icon-md')]")
	WebElement signUPButton;

	public Loginpage() {
	PageFactory.initElements(driver, this);
	}
	
	public String validateLoginpage() {
		return driver.getTitle();
	}
	
	public CredentialsPage loginButtonClick() {
		loginButton.click();
		return new CredentialsPage();
	}
}
