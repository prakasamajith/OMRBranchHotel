package org.hotelbooking;

import java.awt.Robot;
import java.io.IOException;
import java.util.List;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.omrbranch.baseclass.BaseClasses;

public class HotelBooking extends BaseClasses {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		chromeBrowserLaunch();
		maximizeWindow();
		enterApplnUrl("https://omrbranch.com/");
		implicitWait(30);
	}
	@Test(priority = 1)
	public void loginPage() throws IOException, InterruptedException {
		WebElement txtUserName = findLocatorById("email");
		elementSendKeys(txtUserName, getCellData("Details", 0, 0));
		WebElement txtPassword = findLocatorById("pass");
		elementSendKeys(txtPassword, getCellData("Details", 0, 1));
		WebElement btnLogin = findLocatorByXpath("//button[text()='Login']");
		elementClick(btnLogin);
		Thread.sleep(2000);
		WebElement profile = findLocatorByXpath("//a[@data-testid='username']");
		String text = elementGetText(profile);
		System.out.println(text);
	}
	@Test(priority = 2)
	public void searchHotel() throws IOException, InterruptedException {
		WebElement hotelBooking = findLocatorByXpath("//div[@data-href=\"https://omrbranch.com/hotel-booking\"]");
		visibilityOfElement(hotelBooking);
		elementClick(hotelBooking);
		WebElement selectState = findLocatorById("state");
		selectDropdownText(selectState, getCellData("Details", 0, 2));
		Thread.sleep(2000);
		WebElement selectCity = findLocatorById("city");
		selectDropdownText(selectCity, getCellData("Details", 0, 3));
		WebElement roomType = findLocatorById("room_type");
		selectDropdownText(roomType, getCellData("Details", 0, 4));
		selectDropdownText(roomType, getCellData("Details", 0, 5));
		selectDropdownText(roomType, getCellData("Details", 0, 6));
		selectDropdownText(roomType, getCellData("Details", 0, 7));
		selectDropdownText(roomType, getCellData("Details", 0, 8));
		WebElement checkIn = findLocatorByName("check_in");
		textInsertJavascript(checkIn, getCellData("Details", 0, 9));
		WebElement checkOut = findLocatorByName("check_out");
		textInsertJavascript(checkOut, getCellData("Details", 0, 10));
		WebElement noOfRooms = findLocatorById("no_rooms");
		selectDropdownAttribute(noOfRooms, getCellData("Details", 0, 11));
		WebElement noOfAdults = findLocatorById("no_adults");
		selectDropdownAttribute(noOfAdults, getCellData("Details", 0, 12));
		WebElement noOfChilds = findLocatorById("no_child");
		elementSendKeysTab(noOfChilds, getCellData("Details", 0, 13));

		
		
		Thread.sleep(2000);
	}
	@Test(priority = 3)
	public void selectHotel() throws IOException, InterruptedException {
		WebElement selectHotel = findLocatorByXpath("//h5[text()='Select Hotel']");
		visibilityOfElement(selectHotel);
		String printSelectHotel = elementGetText(selectHotel);
		System.out.println(printSelectHotel);
		List<WebElement> listOfHotels = findLocatorByTagName("h5");
		for (WebElement x : listOfHotels) {
			String allHotels = elementGetText(x);
			if (!allHotels.contains("Select Hotel")) {
				System.out.println(allHotels);
			}
		}
		List<WebElement> hotelPrices = findElements("//div[@class='prize']");
		for (WebElement allPrices : hotelPrices) {
			String text = elementGetText(allPrices);
			System.out.println(text);
		}
		Thread.sleep(3000);
		List<WebElement> thirdHotel = findElements("//a[text()='Continue']");
		try {
			thirdHotel.get(2).click();
			Thread.sleep(3000);
			confirmAlert();
			Thread.sleep(3000);
		} catch (StaleElementReferenceException e) {
			List<WebElement> thirdHotel1 = findElements("//a[text()='Continue']");
			thirdHotel1.get(2).click();
			Thread.sleep(3000);
			confirmAlert();
			Thread.sleep(3000);
		}
	}
	@Test(priority = 4)

	public void bookHotel() throws IOException, InterruptedException {

		WebElement selectedHotel = findLocatorByXpath("//h5[contains(text(),'Hyatt Regency')]");

		String chosenHotel = elementGetText(selectedHotel);

		System.out.println(chosenHotel);

		WebElement bookingFor = findLocatorById("own");

		elementClick(bookingFor);

		WebElement salutation = findLocatorById("user_title");

		selectDropdownText(salutation, getCellData("Details", 0, 14));

		WebElement txtFirstName = findLocatorById("first_name");

		elementSendKeys(txtFirstName, getCellData("Details", 0, 15));

		WebElement txtLastName = findLocatorById("last_name");

		elementSendKeys(txtLastName, getCellData("Details", 0, 16));

		WebElement txtPhoneNo = findLocatorById("user_phone");

		elementSendKeys(txtPhoneNo, getCellData("Details", 0, 17));

		WebElement txtEmail = findLocatorById("user_email");

		elementSendKeys(txtEmail, getCellData("Details", 0, 18));

		WebElement gst = findLocatorById("gst");

		elementClick(gst);

		Thread.sleep(1000);

		// GST Details

		WebElement registrationNo = findLocatorById("gst_registration");

		elementSendKeys(registrationNo, getCellData("Details", 0, 19));

		WebElement companyName = findLocatorById("company_name");

		elementSendKeys(companyName, getCellData("Details", 0, 20));

		WebElement companyAddress = findLocatorById("company_address");

		elementSendKeys(companyAddress, getCellData("Details", 0, 21));

		WebElement btnNext = findLocatorById("step1next");

		elementClick(btnNext);

		// Special Request

		WebElement txtRequest = findLocatorById("other_request");

		elementSendKeys(txtRequest, getCellData("Details", 0, 22));

		Thread.sleep(2000);

		WebElement nextReq = findLocatorById("step2next");

		elementClick(nextReq);

		Thread.sleep(2000);

		// Payment Details

		WebElement selectPaymentMethod = findLocatorByXpath("//div[@class='credit-card pm']");

		elementClick(selectPaymentMethod);

		WebElement paymentType = findLocatorById("payment_type");

		selectDropdownText(paymentType, getCellData("Details", 0, 23));

		WebElement cardType = findLocatorById("card_type");

		selectDropdownText(cardType, getCellData("Details", 0, 24));

		WebElement cardNo = findLocatorById("card_no");

		elementSendKeys(cardNo, getCellData("Details", 0, 25));

		WebElement cardName = findLocatorById("card_name");

		elementSendKeys(cardName, getCellData("Details", 0, 26));

		WebElement drpMonth = findLocatorById("card_month");

		selectDropdownText(drpMonth, getCellData("Details", 0, 27));

		WebElement drpYear = findLocatorById("card_year");

		selectDropdownText(drpYear, getCellData("Details", 0, 28));

		WebElement cvv = findLocatorById("cvv");

		elementSendKeys(cvv, getCellData("Details", 0, 29));

		Thread.sleep(2000);

		WebElement btnSubmit = findLocatorById("submitBtn");

		elementClick(btnSubmit);

		Thread.sleep(3000);

		WebElement orderNo = findLocatorByXpath("//strong[contains(text(),'#')]");

		String text = elementGetText(orderNo);

		if (text.contains("#")) {

			String orderNoGenerated = text.substring(1, 11);

			System.out.println(orderNoGenerated);

			createCellAndSetCellData("Details", 0, 30, orderNoGenerated);

		}

		WebElement bookingConfirmedText = findLocatorByXpath("//h2[contains(text(),'Booking is Confirmed')]");

		String bookingConfirmed = elementGetText(bookingConfirmedText);

		String bookingConfirmMessage = bookingConfirmed.substring(12, 32);

		System.out.println(bookingConfirmMessage);

		WebElement bookedHotelName = findLocatorByXpath("//p[contains(text(),'Hotel')]");

		String bookedHotel = elementGetText(bookedHotelName);

		System.out.println(bookedHotel);

		Thread.sleep(2000);

	}

	@Test(priority = 5)

	public void myBooking() throws InterruptedException, IOException {

		WebElement myBooking = findLocatorByXpath("//button[text()='My Booking']");

		elementClick(myBooking);

		Thread.sleep(3000);

		WebElement searchOrderNo = findLocatorByName("search");

		elementSendKeys(searchOrderNo, getCellData("Details", 0, 30));

		Thread.sleep(2000);

		WebElement bookedOrderNo = findLocatorByXpath("(//span[contains(text(),'#')])[2]");

		String bookedOrder = elementGetText(bookedOrderNo);

		if (bookedOrder.contains("#")) {

			String bookedOrdered1 = bookedOrder.substring(1, 11);

			System.out.println(bookedOrdered1);

		}

		WebElement hotelName = findLocatorByXpath("//h5[contains(text(),'Hyatt Regency')]");

		String bookedHotelName = elementGetText(hotelName);

		System.out.println(bookedHotelName);

		WebElement price1 = findLocatorByXpath("//strong[@class='total-prize']");

		String bookedHotelPrice = elementGetText(price1);

		System.out.println(bookedHotelPrice);

		Thread.sleep(1000);

		WebElement editBooking = findLocatorByXpath("//button[text()='Edit']");

		elementClick(editBooking);

		Thread.sleep(1000);

		WebElement checkIn = findLocatorByXpath("check_in");

		elementClick(checkIn);

		Thread.sleep(1000);

		WebElement dateCheckIn = findLocatorByXpath("(//a[@class='ui-state-default'])[9]");

		elementClick(dateCheckIn);

		WebElement bookingConfirm = findLocatorByXpath("//button[text()='Confirm']");

		elementClick(bookingConfirm);

		Thread.sleep(2000);

		WebElement bookingUpdated = findLocatorByXpath("//li[contains(text(),'Booking updated')]");

		String updatedBooking = elementGetText(bookingUpdated);

		System.out.println(updatedBooking);

		Thread.sleep(2000);

	}

	@Test(priority = 6)
	public void cancelBooking() throws InterruptedException, IOException {

		WebElement searchOrderNo = findLocatorByName("search");

		elementSendKeysEnter(searchOrderNo, getCellData("Details", 0, 30));

		WebElement bookedOrderNo = findLocatorByXpath("(//span[contains(text(),'#')])[2]");

		String bookedOrder = elementGetText(bookedOrderNo);

		if (bookedOrder.contains("#")) {

			String bookedOrder1 = bookedOrder.substring(1, 11);

			System.out.println(bookedOrder1);

		}

		WebElement hotelName = findLocatorByXpath("//h5[contains(text(),'Hyatt Regency')]");

		String bookedHotelName = elementGetText(hotelName);

		System.out.println(bookedHotelName);

		WebElement price1 = findLocatorByXpath("//strong[@class='total-prize']");

		String bookedHotelPrice = elementGetText(price1);

		System.out.println(bookedHotelPrice);

		Thread.sleep(3000);

		WebElement btnCancel = findLocatorByXpath("(//a[text()='Cancel'])[1]");

		elementClick(btnCancel);

		Thread.sleep(2000);

		confirmAlert();

		Thread.sleep(2000);

		WebElement cancelBooking = findLocatorByXpath("//li[text()='Your booking cancelled successfully']");

		String bookingCancelled = elementGetText(cancelBooking);

		System.out.println(bookingCancelled);

		Thread.sleep(3000);
		
		closeDriver();
		
		
	}

}
