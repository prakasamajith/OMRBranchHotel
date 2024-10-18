package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {

	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h4[contains(text(),'Bookings')]")
	private WebElement bookings;

	@FindBy(name = "search")
	private WebElement searchTextBox;

	@FindBy(xpath = "(//span[contains(text(),'#')])[2]")
	private WebElement bookedOrderNo;

	@FindBy(xpath = "//h5[contains(text(),'Taj')]")
	private WebElement boookedHotelName;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement price;

	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement editBooking;

	@FindBy(name = "check_in")
	private WebElement editCheckin;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//li[contains(text(),'Booking updated')]")
	private WebElement bookingUpdated;

	// cancel booking

	@FindBy(xpath = "search")
	private WebElement searchOrderNo1;

	@FindBy(xpath = "(//span[contains(text(),'#')])[2]")
	private WebElement bookedOrderNo1;

	@FindBy(xpath = "//h5[contains(text(),'Hyatt Regency')]")
	private WebElement hotelName;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement price2;

	@FindBy(xpath = "//a[text()='Cancel']")
	private List<WebElement> btnCancel;

	@FindBy(xpath = "//li[@class=\"alertMsg\"]")
	private WebElement cancelBooking;

	@FindBy(xpath = "//div[@id='bookinglist']//button[text()='Edit']")
	private List<WebElement> allEditBtn;

	public WebElement getBookings() {
		return bookings;
	}

	public List<WebElement> getAllEditBtn() {
		return allEditBtn;
	}

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getBookedOrderNo() {
		return bookedOrderNo;
	}

	public WebElement getBoookedHotelName() {
		return boookedHotelName;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getEditBooking() {
		return editBooking;
	}

	public WebElement getEditCheckin() {
		return editCheckin;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getBookingUpdated() {
		return bookingUpdated;
	}

	public WebElement getSearchOrderNo1() {
		return searchOrderNo1;
	}

	public WebElement getBookedOrderNo1() {
		return bookedOrderNo1;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getPrice2() {
		return price2;
	}

	public List<WebElement> getBtnCancel() {
		return btnCancel;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}

	public String verifyBookingsText() {
		String booking = elementGetText(bookings);
		System.out.println(booking);
		return booking;
	}

	public void searchOrderId() {
		String orderIdNumber = BookingConfirmationPage.saveOrderId;
		elementSendKeys(searchTextBox, orderIdNumber);
		
	}

	public String orderIdVerify() {
		String bookedOrderId = elementGetText(bookedOrderNo);
		String bookedOrder = bookedOrderId.substring(1, 11);
		return bookedOrder;
	}

	public String bookedHotelNameVerify() {
		String bookedHotel = elementGetText(boookedHotelName);
		return bookedHotel;
	}

	public String bookedHotelPriceVerify() {
		String bookedPrice = elementGetText(price);
		return bookedPrice;
	}

	public void modifyDate(String modifyDate) throws InterruptedException {
		Thread.sleep(2000);
		elementClick(editBooking);
		Thread.sleep(2000);
		elementClear(editCheckin);
		elementSendKeys(editCheckin, modifyDate);
		elementClick(btnConfirm);
	}

	public String bookingUpdatedSuccess() {
		String bookingUpdatedSuccessMsgTxt = elementGetText(bookingUpdated);
		return bookingUpdatedSuccessMsgTxt;
	}

	public void searchNewOrderId(String id) {
		elementSendKeys(searchTextBox, id);
	}

	public void firstDisplayedOrderId(String modifyCheckInDate) {
		WebElement firstHotelEditBtn = allEditBtn.get(0);
		elementClick(firstHotelEditBtn);
		elementClear(editCheckin);
		elementSendKeys(editCheckin, modifyCheckInDate);
		elementClick(btnConfirm);
	}

	public void lastDisplayedOrderId(String modifyCheckInDate) {
		int allEditBtnSize = allEditBtn.size();
		WebElement lastHotelEditBtn = allEditBtn.get(allEditBtnSize-1);
		elementClick(lastHotelEditBtn);
		elementClear(editCheckin);
		elementSendKeys(editCheckin, modifyCheckInDate);
		elementClick(btnConfirm);
	}
	
	public void cancelOrder() throws InterruptedException {
		Thread.sleep(1000);
		int size = btnCancel.size();
		WebElement firstCancelBtn = btnCancel.get(0);
		elementClick(firstCancelBtn);
		Thread.sleep(1000);
		acceptAlert();
	}
	public String verifyCancelMsgText() {
		String cancelBookingMsgTxt = elementGetText(cancelBooking);
		return cancelBookingMsgTxt;
	}
	public void existingOrderCancel() throws InterruptedException {
		Thread.sleep(1000);
		int size = btnCancel.size();
		WebElement thirdExistingCancel = btnCancel.get(3);
		elementClear(thirdExistingCancel);
		Thread.sleep(1000);
		acceptAlert();
	}
}
