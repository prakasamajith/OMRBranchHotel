package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {

	PageObjectManager pom = new PageObjectManager();

	@When("User navigate to My Booking page")
	public void userNavigateToMyBookingPage() {
		pom.getBookingConfirmationPage().navigateToMyBookingPage();
	}

	@Then("User should verify after navigate to My Booking page success message as {string}")
	public void userShouldVerifyAfterNavigateToMyBookingPageSuccessMessageAs(String expBookingsText) {
		String actBookingText = pom.getMyBookingPage().verifyBookingsText();
		boolean contains = actBookingText.contains(expBookingsText);
		Assert.assertTrue("Verify Bookings Text",contains);
	}

	@When("User search the Order ID")
	public void userSearchTheOrderID() throws InterruptedException {
		pom.getMyBookingPage().searchOrderId();

	}

	@Then("User should verify same booked Order ID is present or not")
	public void userShouldVerifySameBookedOrderIDIsPresentOrNot() {
		String searchOrderId = pom.getMyBookingPage().orderIdVerify();
		String orderId = pom.getBookingConfirmationPage().getOrderId();
		boolean contains = searchOrderId.contains(orderId);
		Assert.assertTrue(contains);
		System.out.println(contains);
	}

	@Then("User should verify same booked Hotel Name is present or not")
	public void userShouldVerifySameBookedHotelNameIsPresentOrNot() {
		String bookedHotelNameVerify = pom.getMyBookingPage().bookedHotelNameVerify();
		String hotelName = SelectHotelPage.lastHotelName;
		boolean contains = bookedHotelNameVerify.contains(hotelName);
		Assert.assertTrue("Verify Same Booked Hotel Name", contains);
		System.out.println(contains);
	}

	@Then("User should verify same booked Hotel Price is present or not")
	public void userShouldVerifySameBookedHotelPriceIsPresentOrNot() {
		String bookedHotelPriceVerify = pom.getMyBookingPage().bookedHotelPriceVerify();
		String hotelPrice = SelectHotelPage.lastHotelPrice;
		boolean contains = bookedHotelPriceVerify.equals(hotelPrice);
		System.out.println(bookedHotelPriceVerify);
	}

	@When("User edit the Check-in Date {string}")
	public void userEditTheCheckInDate(String ModifyDate) throws InterruptedException {
		pom.getMyBookingPage().modifyDate(ModifyDate);
	}

	@Then("User should verify after modify check-in date success message {string}")
	public void userShouldVerifyAfterModifyCheckInDateSuccessMessage(String expBookingUpdatedSuccess) {
		String actBookingUpdatedSuccess = pom.getMyBookingPage().bookingUpdatedSuccess();
		Assert.assertEquals("Verify Booking Updated Success Text",expBookingUpdatedSuccess,actBookingUpdatedSuccess );
		System.out.println(actBookingUpdatedSuccess);
	}

	@When("User search the Order ID {string}")
	public void userSearchTheOrderID(String id) {
		pom.getMyBookingPage().searchNewOrderId(id);
	}

	@When("User edit the Check-in Date for the first displayed Order ID {string}")
	public void userEditTheCheckInDateForTheFirstDisplayedOrderID(String modifyCheckInDate) {
		pom.getMyBookingPage().firstDisplayedOrderId(modifyCheckInDate);
	}

	@When("User edit the Check-in Date for the last displayed Order ID {string}")
	public void userEditTheCheckInDateForTheLastDisplayedOrderID(String modifyCheckInDate) {
		pom.getMyBookingPage().lastDisplayedOrderId(modifyCheckInDate);
	}

}
