package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User click Search button")
	public void userClickSearchButton() {
		pom.getSearchHotelPage().clickSearchButton();
	}

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String state, String city, String roomType, String checkIn, String checkOut,
			String noOfRooms, String adultsCount, String childCount) {

		pom.getSearchHotelPage().searchHotel(state, city, roomType, checkIn, checkOut, noOfRooms, adultsCount,
				childCount);

		pom.getSearchHotelPage().clickSearchButton();
	}

	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String expSuccessMsgText) {

		pom.getSearchHotelPage().selectSuccessMsg();
		String actLoginSuccessMsgText = pom.getSearchHotelPage().selectSuccessMsg();
		Assert.assertEquals("Verify after select hotel success msg", expSuccessMsgText, actLoginSuccessMsgText);
		System.out.println(actLoginSuccessMsgText);
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void userSearchHotelAnd(String state, String city, String checkIn, String checkOut, String noOfRooms,
			String adultsCount) {
		pom.getSearchHotelPage().searchHotelMandatory(state, city, checkIn, checkOut, noOfRooms, adultsCount);
		pom.getSearchHotelPage().clickSearchButton();
	}

	@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageAnd(String expStateErrorMsgText, String expCityErrorMsgText,
			String expCheckInErrorMsgText, String expCheckOutErrorMsgText, String expNoOfRoomsErrorMsgText,
			String expNoOfAdultsErrorMsgText) {

		String stateNameErrorMsgText = pom.getSearchHotelPage().getStateNameErrorMsgText();
		boolean contains = stateNameErrorMsgText.contains(stateNameErrorMsgText);
		Assert.assertTrue("Verify after click search state error msg contains", contains);
		String cityNameErrorMsgText = pom.getSearchHotelPage().getCityNameErrorMsgText();
		boolean contains2 = cityNameErrorMsgText.contains(cityNameErrorMsgText);
		Assert.assertTrue("Verify after click search city error msg contains", contains2);
		String checkInErrorMsgText = pom.getSearchHotelPage().getCheckInErrorMsgText();
		boolean contains3 = checkInErrorMsgText.contains(checkInErrorMsgText);
		Assert.assertTrue("Verify after click search checkIn error msg contains", contains3);
		String checkOutErrorMsgText = pom.getSearchHotelPage().getCheckOutErrorMsgText();
		boolean contains4 = checkOutErrorMsgText.contains(checkOutErrorMsgText);
		Assert.assertTrue("Verify after click search checkOut error msg contains", contains4);
		String noOfRoomsErrorMsgText = pom.getSearchHotelPage().getNoOfRoomsErrorMsgText();
		boolean contains5 = noOfRoomsErrorMsgText.contains(noOfRoomsErrorMsgText);
		Assert.assertTrue("Verify after click search noOfRooms error msg contains", contains5);
		String noOfAdultsErrorMsgText = pom.getSearchHotelPage().getNoOfAdultsErrorMsgText();
		boolean contains6 = noOfAdultsErrorMsgText.contains(noOfAdultsErrorMsgText);
		Assert.assertTrue("Verify after click search noOfAdults error msg contains", contains6);

	}

	@When("User click sort from low to high")
	public void userClickSortFromLowToHigh() throws InterruptedException {
		pom.getSearchHotelPage().clickSort();
	}

	@Then("User should verify after sorting that price are listed from low to high")
	public void userShouldVerifyAfterSortingThatPriceAreListedFromLowToHigh() {

		pom.getSearchHotelPage().priceLowToHighVerify();

	}

	@When("User click sort from Descending order")
	public void userClickSortFromDescendingOrder() throws InterruptedException {
		pom.getSearchHotelPage().clickDecendingOrder();
	}

	@Then("User should verify after sorting that name in Descending order")
	public void userShouldVerifyAfterSortingThatNameInDescendingOrder() {

		pom.getSearchHotelPage().verifyDecendingNameList();

	}

	@When("User click Suite room type")
	public void userClickSuiteRoomType() throws InterruptedException {
		pom.getSearchHotelPage().clickSuite();
	}

	@Then("User should verify after sorting that Suite room type is listed")
	public void userShouldVerifyAfterSortingThatSuiteRoomTypeIsListed() {
		pom.getSearchHotelPage().verifySuiteList();
	}

	@When("User enter {string} and {string}")
	public void userEnterAnd(String string, String string2) {
	}

	@Then("User should verify sucees message after login {string}")
	public void userShouldVerifySuceesMessageAfterLogin(String string) {
	}

	@Then("User should verify the header contains {string}")
	public void userShouldVerifyTheHeaderContains(String expRoomType) {

		String roomTypesVerify = pom.getSearchHotelPage().roomTypesVerify();
		Assert.assertEquals("Verify after search list of rooms displayed", expRoomType, roomTypesVerify);
	}

}
