package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {
	
	PageObjectManager pom = new PageObjectManager();

	@When("User save the last hotel name and hotel price")
	public void userSaveTheLastHotelNameAndHotelPrice() {

		pom.getSelectHotelPage().lastHotelName();
		pom.getSelectHotelPage().lastHotelPrice();

	}

	@When("User select the last hotel and accept the alert")
	public void userSelectTheLastHotelAndAcceptTheAlert() throws InterruptedException {
		pom.getSelectHotelPage().clicklastHotel();
	}

	@Then("User should verify after select success message {string}")
	public void userShouldVerifyAfterSelectSuccessMessage(String expBookHotelMsgText) {
		String actBookHotelMsgText = pom.getSelectHotelPage().verifyBookHotelText();
		boolean contains = actBookHotelMsgText.contains(expBookHotelMsgText);
		Assert.assertTrue("Verify Book Hotel Text", contains);
	}

	@When("User save the second from last hotel name and hotel price")
	public void userSaveTheSecondFromLastHotelNameAndHotelPrice() {
		pom.getSelectHotelPage().secLastHotelName();
		pom.getSelectHotelPage().secLastHotelPrice();
	}

	@When("User select the second from last hotel and accept the alert")
	public void userSelectTheSecondFromLastHotelAndAcceptTheAlert() throws InterruptedException {
		pom.getSelectHotelPage().secClicklastHotel();
	}

	@When("User save the first hotel name and hotel price")
	public void userSaveTheFirstHotelNameAndHotelPrice() {
		pom.getSelectHotelPage().firstHotelName();
		pom.getSelectHotelPage().firstHotelPrice();

	}

	@When("User select the first hotel and accept the alert")
	public void userSelectTheFirstHotelAndAcceptTheAlert() throws InterruptedException {
		pom.getSelectHotelPage().firstHotelClick();
	}

}
