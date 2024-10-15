package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;


public class MyBookingPage extends BaseClass {

	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="search")
	private WebElement searchOrderNo;
	
	@FindBy(xpath="(//span[contains(text(),'#')])[2]")
	private WebElement bookedOrderNo;
	
	@FindBy(xpath="//h5[contains(text(),'Hyatt Regency')")
	private WebElement boookedHotelName;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement price1;
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement editBooking;
	
	@FindBy(name="check_in")
	private WebElement editCheckin;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement btnConfirm;
	
	@FindBy(xpath="//li[contains(text(),'Booking updated')]")
	private WebElement bookingUpdated;
	
	
	//cancel booking
	
	@FindBy(xpath="search")
	private WebElement searchOrderNo1;
	
	@FindBy(xpath="(//span[contains(text(),'#')])[2]")
	private WebElement bookedOrderNo1;
	
	@FindBy(xpath="//h5[contains(text(),'Hyatt Regency')]")
	private WebElement hotelName;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement price2;
	
	@FindBy(xpath="(//a[text()='Cancel'])[1]")
	private WebElement btnCancel;
	
	@FindBy(xpath="//li[text()='Your booking cancelled successfully']")
	private WebElement cancelBooking;

	public WebElement getSearchOrderNo() {
		return searchOrderNo;
	}

	public WebElement getBookedOrderNo() {
		return bookedOrderNo;
	}

	public WebElement getBoookedHotelName() {
		return boookedHotelName;
	}

	public WebElement getPrice1() {
		return price1;
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

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}
	
}
