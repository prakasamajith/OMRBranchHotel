package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.baseclass.BaseClasses;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;

	@FindBy(id = "errorMessage")
	private WebElement invalidLogin;

	@FindBy(xpath = "//h3[text()=\"Hotel Booking\"]")
	private WebElement hotelBooking;
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textLoginSuccessMsg;

	public WebElement getTextLoginSuccessMsg() {
		return textLoginSuccessMsg;
	}

	public void setHotelBooking(WebElement hotelBooking) {
		this.hotelBooking = hotelBooking;
	}

	public WebElement getHotelBooking() {
		return hotelBooking;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getInvalidLogin() {
		return invalidLogin;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login(String userName, String password) {
		elementSendKeys(txtEmail, userName);
		elementSendKeys(txtPassword, password);
		elementClick(btnLogin);
		elementClick(hotelBooking);
	}

	public void loginWithEnterKey(String userName, String password) throws AWTException {
		elementSendKeys(txtEmail, userName);
		elementSendKeys(txtPassword, password);
		pressEnter();
		elementClick(hotelBooking);
	}

	public String getInvalidErrorMsg() {
		String d = elementGetText(invalidLogin);
		String replace = d.replace(" Click here to reset your password", "");
		System.out.println(replace);
		return d;
	}

	public String getLoginSuccessMsgText() {
		String elementGetText = elementGetText(textLoginSuccessMsg);
		return elementGetText;
	}
}
