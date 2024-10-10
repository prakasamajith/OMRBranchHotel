package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClasses;

public class BookingConfirmationPage extends BaseClasses{

	
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//strong[contains(text(),'#')]")
	private WebElement orderNo;
	
	@FindBy(xpath="//h2[contains(text(),'Booking is Confirmed')]")
	private WebElement txtBookingConfirmed;
	
	@FindBy(xpath="//p[contains(text(),'Hotel')]")
	private WebElement txtbookedHotelName;
	
	@FindBy(xpath="//button[text()='My Booking']")
	private WebElement myBooking1;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getTxtBookingConfirmed() {
		return txtBookingConfirmed;
	}

	public WebElement getTxtbookedHotelName() {
		return txtbookedHotelName;
	}
	
	public WebElement getMyBooking1() {
		return myBooking1;
	}
}
