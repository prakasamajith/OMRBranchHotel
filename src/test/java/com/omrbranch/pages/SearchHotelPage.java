package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "searchBtn")
	private WebElement btnSearch;

	@FindBy(xpath = "//iframe[@id=\"hotelsearch_iframe\"]")
	private WebElement frame;

	@FindBy(xpath = "//h5[text()=\"Select Hotel\"]")
	private WebElement selectHotelMsg;

	public WebElement getSelectHotelMsg() {
		return selectHotelMsg;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
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

	@FindBy(xpath = "//a[contains(text(),'Standard/Deluxe/Suite/Luxury/Studio')]")
	private WebElement roomTypeTexts;

	@FindBy(xpath = "//label[@for=\"Suite\"]")
	private WebElement suite;

	@FindBy(xpath = "//label[@for=\"Standard\"]")
	private WebElement Standard;

	@FindBy(xpath = "//div[@id='hotellist']//h5")
	private List<WebElement> allHotels;

	@FindBy(xpath = "//div[@id='hotellist']//strong")
	private List<WebElement> allHotelPrice;

	public List<WebElement> getAllHotelPrice() {
		return allHotelPrice;
	}

	public WebElement getStandard() {
		return Standard;
	}

	public WebElement getSuite() {
		return suite;
	}

	public List<WebElement> getAllHotels() {
		return allHotels;
	}

	public WebElement getRoomTypeTexts() {
		return roomTypeTexts;
	}

	public WebElement getNameDecendingOrder() {
		return nameDecendingOrder;
	}

	public WebElement getPriceLowToHigh() {
		return priceLowToHigh;
	}

	public WebElement getFrame() {
		return frame;
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

	public void clickSearchButton() {
		driver.switchTo().frame(frame);
		elementClick(btnSearch);
		driver.switchTo().defaultContent();
	}

	public String selectSuccessMsg() {
		String actSuccessMsgText = elementGetText(selectHotelMsg);
		return actSuccessMsgText;
	}

	public void searchHotel(String state, String city, String roomType, String checkIn, String checkOut,
			String noOfRooms, String adultsCount, String childCount) {

		selectOptionByValue(drpState, state);
		selectOptionByValue(txtCity, city);
//		selectOptionByValue(txtRoomType, roomType);
		selectRoomType(roomType);
		elementSendKeysJs(txtCheckIn, checkIn);
		elementSendKeysJs(txtCheckOut, checkOut);
		selectOptionByValue(txtRooms, noOfRooms);
		selectOptionByValue(txtAdults, adultsCount);
		elementSendKeys(txtChilds, childCount);

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

	public void clickSort() throws InterruptedException {
		elementClick(priceLowToHigh);
		Thread.sleep(2000);
	}

	public List<Integer> priceLowToHighVerify() {

		List<Integer> devPriceList = new ArrayList<Integer>();
		List<Integer> qaPriceList = new ArrayList<Integer>();
		for (WebElement price : allHotelPrice) {
			String eachHotelPrice = elementGetText(price);
			System.out.println(eachHotelPrice);
			String replaceAll = eachHotelPrice.replaceAll("[\\$\\s,]", "");
//			String substring = eachHotelPrice.substring(1, 7);
//			String replaceSpace = substring.replace(" ", "");
//			String replaceComma = replaceSpace.replace(",", "");
			int priceList = Integer.parseInt(replaceAll);
			devPriceList.add(priceList);
		}
		System.out.println(devPriceList);
		qaPriceList.addAll(devPriceList);
		Collections.sort(qaPriceList);
		System.out.println(qaPriceList);
		boolean priceOrder = devPriceList.equals(qaPriceList);
		if (priceOrder) {
			System.out.println("All Hotel Price Lists are in Correct Order");
		} else {
			System.out.println("All Hotel Price Lists are Not in Correct Order");
		}
		return qaPriceList;
	}

	public void clickDecendingOrder() throws InterruptedException {
		elementClick(nameDecendingOrder);
		Thread.sleep(2000);
	}

	public void verifyDecendingNameList() {
		List<String> devHotelList = new ArrayList<>();
		List<String> qahotelList = new ArrayList<>();
		for (WebElement eachHotelName : allHotels) {
			String hotelsList = elementGetText(eachHotelName);
			String hotel = hotelsList.replace(" ", "");
			devHotelList.add(hotel);
		}
		System.out.println(devHotelList);
		qahotelList.addAll(devHotelList);
		Collections.sort(qahotelList);
		Collections.reverse(qahotelList);
		System.out.println(qahotelList);
		boolean equals = devHotelList.equals(qahotelList);
		if (equals) {
			System.out.println("All Hotel Names are in Descending Order");
		} else {
			System.out.println("All Hotel Names are Not in Descending Order");
		}
	}

	public void selectRoomType(String roomType) {
		String[] split = roomType.split("/");
		for (String v : split) {
			selectOptionByText(txtRoomType, v);
		}
	}

	public String roomTypesVerify() {
		String roomTypeTxts = elementGetText(roomTypeTexts);
		return roomTypeTxts;
	}

	public void clickSuite() throws InterruptedException {
		elementClick(Standard);
		Thread.sleep(2000);
		elementClick(suite);
		Thread.sleep(2000);
	}

	public void verifySuiteList() {
		List<String> devHotelList = new ArrayList<>();
		List<Boolean> qahotelList = new ArrayList<>();
		for (WebElement suiteName : allHotels) {
			String allSuite = suiteName.getText();
			System.out.println(allSuite);
			devHotelList.add(allSuite);
		}
		for (String suiteList : devHotelList) {
			boolean contains = suiteList.endsWith("Suite");
			System.out.println(contains);
			qahotelList.add(contains);
		}
		boolean compareHotels = qahotelList.contains(false);
		if (compareHotels) {
			System.out.println("All hotels are Not Suite Type");
		} else {
			System.out.println("All hotels are Suite Type");
		}
	}

}
