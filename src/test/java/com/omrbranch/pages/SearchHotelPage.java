package com.omrbranch.pages;

import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.baseclass.BaseClasses;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement textLoginSuccessMsg;

	public WebElement getTextLoginSuccessMsg() {
		return textLoginSuccessMsg;
	}

	@FindBy(id = "state")
	private WebElement drpState;

	@FindBy(id = "city")
	private WebElement txtCity;

	@FindBy(id = "room_type")
	private WebElement txtRoomType;

	@FindBy(name = "check_in")
	private WebElement txtCheckIn;

	@FindBy(name = "check_out")
	private WebElement txtCheckOut;

	@FindBy(id = "no_rooms")
	private WebElement txtRooms;

	@FindBy(id = "no_adults")
	private WebElement txtAdults;

	@FindBy(id = "no_child")
	private WebElement txtChilds;

	@FindBy(id = "searchBtn")
	private WebElement btnSearch;

	@FindBy(xpath = "//iframe[@id=\"hotelsearch_iframe\"]")
	private WebElement frame;

	@FindBy(xpath = "//h5[text()=\"Select Hotel\"]")
	private WebElement selectHotelMsg;

	@FindBy(id = "invalid-state")
	private WebElement stateError;

	@FindBy(id = "invalid-city")
	private WebElement cityError;

	@FindBy(id = "invalid-check_in")
	private WebElement checkInError;

	@FindBy(id = "invalid-check_out")
	private WebElement checkOutError;

	@FindBy(id = "invalid-no_rooms")
	private WebElement noOfRoomsError;

	@FindBy(id = "invalid-no_adults")
	private WebElement noOfAdultsError;

	
	@FindBy(xpath = "//label[text()=\"Price low to high\"]")
	private WebElement priceLowToHigh;

	@FindBy(xpath = "//label[text()=\"Name Descending\"]")
	private WebElement nameDecendingOrder;

	public WebElement getNameDecendingOrder() {
		return nameDecendingOrder;
	}

	public WebElement getPriceLowToHigh() {
		return priceLowToHigh;
	}
	
	public WebElement getStateError() {
		return stateError;
	}

	public WebElement getCityError() {
		return cityError;
	}

	public WebElement getCheckInError() {
		return checkInError;
	}

	public WebElement getCheckOutError() {
		return checkOutError;
	}

	public WebElement getNoOfRoomsError() {
		return noOfRoomsError;
	}

	public WebElement getNoOfAdultsError() {
		return noOfAdultsError;
	}

	public WebElement getSelectHotelMsg() {
		return selectHotelMsg;
	}

	public WebElement getDrpState() {
		return drpState;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getTxtRooms() {
		return txtRooms;
	}

	public WebElement getTxtAdults() {
		return txtAdults;
	}

	public WebElement getTxtChilds() {
		return txtChilds;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getFrame() {
		return frame;
	}

	public String getLoginSuccessMsgText() {
		String elementGetText = elementGetText(textLoginSuccessMsg);
		return elementGetText;
	}

	public void searchHotel(String state, String city, String roomType, String checkIn, String checkOut,
			String noOfRooms, String adultsCount, String childCount) {

		selectOptionByValue(drpState, state);
		selectOptionByValue(txtCity, city);
		selectOptionByValue(txtRoomType, roomType);
		elementSendKeysJs(txtCheckIn, checkIn);
		elementSendKeysJs(txtCheckOut, checkOut);
		selectOptionByValue(txtRooms, noOfRooms);
		selectOptionByValue(txtAdults, adultsCount);
		elementSendKeys(txtChilds, childCount);

	}

	public void clickSearchButton() {
		driver.switchTo().frame(frame);
		elementClick(btnSearch);
		driver.switchTo().defaultContent();
	}

	public String selectSuccessMsg() {
		String actSuccessMsgText = elementGetText(selectHotelMsg);
		return actSuccessMsgText;
	}

	public void searchHotelMandatory(String state, String city, String checkIn, String checkOut, String noOfRooms,
			String adultsCount) {
		selectOptionByValue(drpState, state);
		selectOptionByValue(txtCity, city);
		elementSendKeysJs(txtCheckIn, checkIn);
		elementSendKeysJs(txtCheckOut, checkOut);
		selectOptionByValue(txtRooms, noOfRooms);
		selectOptionByValue(txtAdults, adultsCount);
	}

	public String getStateNameErrorMsgText() {
		String stateErrorMsgText = elementGetText(stateError);
		return stateErrorMsgText;
	}

	public String getCityNameErrorMsgText() {
		String stateErrorMsgText = elementGetText(cityError);
		return stateErrorMsgText;
	}

	public String getCheckInErrorMsgText() {
		String stateErrorMsgText = elementGetText(checkInError);
		return stateErrorMsgText;
	}

	public String getCheckOutErrorMsgText() {
		String stateErrorMsgText = elementGetText(checkOutError);
		return stateErrorMsgText;
	}

	public String getNoOfRoomsErrorMsgText() {
		String stateErrorMsgText = elementGetText(noOfRoomsError);
		return stateErrorMsgText;
	}

	public String getNoOfAdultsErrorMsgText() {
		String stateErrorMsgText = elementGetText(noOfAdultsError);
		return stateErrorMsgText;
	}

	public void clickSort() {
		elementClick(priceLowToHigh);
	}

	public void clickDecendingOrder() {
		elementClick(nameDecendingOrder);
	}


	

}
