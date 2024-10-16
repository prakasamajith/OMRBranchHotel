package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pages.SelectHotelPage;

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

	@When("User proceed without GST details")
	public void userProceedWithoutGSTDetails() {
		pom.getBookHotelPage().nextBtnWithoutGst();
	}

	@When("User enter payment details, procced with Card Type {string}")
	public void userEnterPaymentDetailsProccedWithCardType(String cardType, io.cucumber.datatable.DataTable dataTable) {
		pom.getBookHotelPage().cardPayment();
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

		String cardMonth1 = map.get("Month");
		WebElement cardMonth = pom.getBookHotelPage().getCardMonth();
		selectOptionByText(cardMonth, cardMonth1);

		String year = map.get("Year");
		WebElement cardYear = pom.getBookHotelPage().getCardYear();
		selectOptionByText(cardYear, year);

		String cvv = map.get("CVV");
		WebElement cardCvv = pom.getBookHotelPage().getCardCvv();
		elementSendKeys(cardCvv, cvv);

		pom.getBookHotelPage().submit();

	}

	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void userShouldVerifyAfterHotelBookingSuccessMessageAndSaveTheOrderID(String expBookingSuccessMsgTxt) {
		String actBookingSuccessMsgTxt = pom.getBookingConfirmationPage().bookingConfirmMsg();
		boolean contains = actBookingSuccessMsgTxt.contains(expBookingSuccessMsgTxt);
		Assert.assertTrue("Verify Booking Confirmed Message", contains);
		System.out.println(pom.getBookingConfirmationPage().getOrderId());

	}

	@Then("User should verify same selected Hotel is booked or not")
	public void userShouldVerifySameSelectedHotelIsBookedOrNot() {
		String lastHotelNameText = SelectHotelPage.lastHotelName;
		String bookedHotelName = pom.getBookingConfirmationPage().bookedHotelNameText();
		boolean contains = bookedHotelName.contains(lastHotelNameText);
		Assert.assertTrue("Verify same hotel booked or not", contains);

	}

	@When("User should not Enter any special request")
	public void userShouldNotEnterAnySpecialRequest() {
		pom.getBookHotelPage().nextBtnAfterSplReq();
	}

	@When("User click credit card")
	public void userClickCreditCard() {
		pom.getBookHotelPage().cardPayment();
	}

	@When("User click submit without enetring payment details")
	public void userClickSubmitWithoutEnetringPaymentDetails() {
		pom.getBookHotelPage().submit();

	}

	@Then("User should verify after payment details error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterPaymentDetailsErrorMessageAnd(String expPaymentErrorMsg, String expCardTypeError,
			String expCardNoError, String expCardNameError, String expCardMonthError, String expCardCvvError) {
		String actPaymentErrorMsg = pom.getBookHotelPage().paymentErrorMsg();
		Assert.assertEquals("Verify PaymentType Error Message", expPaymentErrorMsg, actPaymentErrorMsg);
		System.out.println(actPaymentErrorMsg);
		String actCardTypeError = pom.getBookHotelPage().cardTypeError();
		Assert.assertEquals("Verify CardType Error Message", expCardTypeError, actCardTypeError);
		System.out.println(actCardTypeError);
		String actCardNoError = pom.getBookHotelPage().cardNoError();
		Assert.assertEquals("Verify CardTNo Error Message", expCardNoError, actCardNoError);
		System.out.println(actCardNoError);
		String actCardNameError = pom.getBookHotelPage().cardNameError();
		Assert.assertEquals("Verify CardName Error Message", expCardNameError, actCardNameError);
		System.out.println(actCardNameError);
		String actCardMonthError = pom.getBookHotelPage().cardMonthError();
		Assert.assertEquals("Verify CardMonth Error Message", expCardMonthError, actCardMonthError);
		System.out.println(actCardMonthError);
		String actCardCvvError = pom.getBookHotelPage().cardCvvError();
		Assert.assertEquals("Verify CardCvv Error Message", expCardCvvError, actCardCvvError);
		System.out.println(actCardCvvError);
	}

	@When("User enter upi details {string} and click submit")
	public void userEnterUpiDetailsAndClickSubmit(String upiId) {
		pom.getBookHotelPage().upiId(upiId);
		pom.getBookHotelPage().submit();
	}

	@When("User click upi")
	public void userClickUpi() {
		pom.getBookHotelPage().upiClick();
	}

	@Then("User should verify after payment details error message {string}")
	public void userShouldVerifyAfterPaymentDetailsErrorMessage(String expInvalidUpiErrorMsg) {
		String actInvalidUpiErrorMsg = pom.getBookHotelPage().invalidUpi();
		Assert.assertEquals("Verify Upi Payment Error Message", expInvalidUpiErrorMsg, actInvalidUpiErrorMsg);
	}

}
