package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	public static String saveOrderId;

	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[contains(text(),'#')]")
	private WebElement orderNo;

	@FindBy(xpath = "//h2[contains(text(),'Booking is Confirmed')]")
	private WebElement txtBookingConfirmed;

	@FindBy(xpath = "//p[contains(text(),'Hotel')]")
	private WebElement txtbookedHotelName;

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement myBooking;

	@FindBy(xpath = "//a[@data-testid=\"username\"]")
	private WebElement user;

	@FindBy(xpath = "//a[text()=\"My Account\"]")
	private WebElement myAccount;

	public WebElement getMyAccount() {
		return myAccount;
	}

	public static String getSaveOrderId() {
		return saveOrderId;
	}

	public WebElement getMyBooking() {
		return myBooking;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getTxtBookingConfirmed() {
		return txtBookingConfirmed;
	}

	public WebElement getTxtbookedHotelName() {
		return txtbookedHotelName;
	}

	public String bookingConfirmMsg() {
		String orderId = elementGetText(txtBookingConfirmed);
		String orderNumber = orderId.substring(12, 32);
		return orderNumber;
	}

	public String getOrderId() {
		String orderId = elementGetText(orderNo);
		saveOrderId = orderId.substring(1, 11);
		return saveOrderId;
	}

	public String bookedHotelNameText() {
		String hotelName = elementGetText(txtbookedHotelName);
		System.out.println(hotelName);
		return hotelName;
	}

	public void navigateToMyBookingPage() {
		elementClick(user);
		elementClick(myAccount);

	}

}
