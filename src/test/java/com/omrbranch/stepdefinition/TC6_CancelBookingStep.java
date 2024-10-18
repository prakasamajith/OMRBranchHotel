package com.omrbranch.stepdefinition;


import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_CancelBookingStep {

	PageObjectManager pom = new PageObjectManager();
	
	@When("User should Cancel the new order ID")
	public void userShouldCancelTheNewOrderID() throws InterruptedException {
		pom.getMyBookingPage().cancelOrder();
	}
	@Then("User should verify after cancel booking success message {string}")
	public void userShouldVerifyAfterCancelBookingSuccessMessage(String expCancelMsgText) {
		String actCancelMsgText = pom.getMyBookingPage().verifyCancelMsgText();
		Assert.assertEquals("Verify Booking Canceled Successfully Msg Text",expCancelMsgText, actCancelMsgText);
		System.out.println(actCancelMsgText);
	}

	@When("User should Cancel the existing order ID {string}")
	public void userShouldCancelTheExistingOrderID(String string) {

	}

	@When("User should Cancel the first order ID")
	public void userShouldCancelTheFirstOrderID() {

	}

	@When("User should Cancel the last order ID")
	public void userShouldCancelTheLastOrderID() {

	}
	











	
	
	
}
