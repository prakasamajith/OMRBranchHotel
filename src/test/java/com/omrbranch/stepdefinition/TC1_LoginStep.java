package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Assert;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	}

	@When("User login {string} and {string}")
	public void userLoginAnd(String userName, String password) {
		pom.getLoginPage().login(userName, password);
	}

	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expLoginSuccessMsgText) {
		String actLoginSuccessMsgText = pom.getSearchHotelPage().getLoginSuccessMsgText();
		Assert.assertEquals("Verify after login success msg", expLoginSuccessMsgText, actLoginSuccessMsgText);
		System.out.println(actLoginSuccessMsgText);
	}

	@When("User login {string} and {string} with enter key")
	public void userLoginAndWithEnterKey(String userName, String password) throws AWTException {
		pom.getLoginPage().loginWithEnterKey(userName, password);
	}

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String expLoginErrorMsgText) {
		String actLoginErrorMsgText = pom.getLoginPage().getInvalidErrorMsg();
		boolean contains = actLoginErrorMsgText.contains(actLoginErrorMsgText);
		Assert.assertTrue("Verify after login error msg contains", contains);
	}
}
