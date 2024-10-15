package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void userAddGuestDetailsAnd(String txtsalutation, String firstName, String lastName, String mobile,
			String email) {
		pom.getBookHotelPage().guestDetails(txtsalutation, firstName, lastName, mobile, email);
	}

	@When("User add GST Details {string},{string} and {string}")
	public void userAddGSTDetailsAnd(String regNo, String companyName, String companyAddress) {
		pom.getBookHotelPage().gstDetails(regNo, companyName, companyAddress);
	}

	@When("User add Special Request {string}")
	public void userAddSpecialRequest(String specialRequest) {
		pom.getBookHotelPage().specialRequest(specialRequest);

	}

	@When("User enter payment details, procced with Card Type {string}")
	public void userEnterPaymentDetailsProccedWithCardType(String cardType, io.cucumber.datatable.DataTable dataTable) {
		pom.getBookHotelPage().cardDetails(cardType, dataTable);
		WebElement selectCard2 = pom.getBookHotelPage().getPaymentType();
		selectOptionByText(selectCard2, cardType);

		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String selectCard = map.get("Select Card");
		WebElement selectCard3 = pom.getBookHotelPage().getSelectCard();
		elementSendKeys(selectCard3, selectCard);
		
		String cardNumber = map.get("Card No");
		WebElement cardNo = pom.getBookHotelPage().getCardNo();
		elementSendKeys(cardNo, cardNumber);
		
		String cardName = map.get("Card Name");
		WebElement cardName1 = pom.getBookHotelPage().getCardName();
		elementSendKeys(cardName1, cardName);
		
		WebElement cardMonth = pom.getBookHotelPage().getCardMonth();
		
		

	}

	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void userShouldVerifyAfterHotelBookingSuccessMessageAndSaveTheOrderID(String string) {
	}

	@Then("User should verify same selected Hotel is booked or not")
	public void userShouldVerifySameSelectedHotelIsBookedOrNot() {
	}

	@When("User click credit card")
	public void userClickCreditCard() {

	}

	@When("User click submit without enetring payment details")
	public void userClickSubmitWithoutEnetringPaymentDetails() {

	}

	@Then("User should verify after payment details error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterPaymentDetailsErrorMessageAnd(String string, String string2, String string3,
			String string4, String string5, String string6) {

	}

	@When("User enter upi details {string} and click submit")
	public void userEnterUpiDetailsAndClickSubmit(String string) {

	}

	@When("User click upi")
	public void userClickUpi() {

	}

	@Then("User should verify after payment details error message {string}")
	public void userShouldVerifyAfterPaymentDetailsErrorMessage(String string) {

	}

}
