package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {

	public static String lastHotelName;
	public static String lastHotelPrice;
	public static String secLastHotelName;
	public static String seclastHotelPrice;
	public static String firstHotelNameSave;
	public static String firstHotelPriceSave;

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement selectHotel;

	@FindBy(tagName = "h5")
	private WebElement hotelList;

	@FindBy(name = "//div[@id='hotellist']//h5")
	private WebElement hotelNames;

	@FindBy(xpath = "//div[@class='price']")
	private WebElement hotelPrices;

	@FindBy(xpath = "//div[@id='hotellist']//a")
	private List<WebElement> btnContinue;

	@FindBy(xpath = "//div[@id='hotellist']//h5")
	private List<WebElement> allHotelName;

	@FindBy(xpath = "//strong[@class=\"total-prize\"]")
	private List<WebElement> HotelPrice;

	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	private List<WebElement> btnClickContinue;

	@FindBy(xpath = "//h2[contains(text(),'Book')]")
	private WebElement bookHotelTxt;

	public WebElement getBookHotelTxt() {
		return bookHotelTxt;
	}

	public List<WebElement> getLstHotelName() {
		return allHotelName;
	}

	public List<WebElement> getLstHotelPrice() {
		return HotelPrice;
	}

	public List<WebElement> getBtnClickContinue() {
		return btnClickContinue;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public static String getLastHotelName() {
		return lastHotelName;
	}

	public WebElement getHotelList() {
		return hotelList;
	}

	public WebElement getHotelNames() {
		return hotelNames;
	}

	public WebElement getHotelPrices() {
		return hotelPrices;
	}

	public List<WebElement> getBtnContinue() {
		return btnContinue;
	}

	public void lastHotelName() {
		int size = allHotelName.size();
		WebElement lastHotel = allHotelName.get(size - 1);
		String lastHotelText = lastHotel.getText();
		lastHotelName = lastHotelText.substring(0, 14);
		System.out.println(lastHotelName);
	}

	public void lastHotelPrice() {
		int size1 = HotelPrice.size();
		WebElement lastPrice = HotelPrice.get(size1 - 1);
		lastHotelPrice = lastPrice.getText();
		System.out.println(lastHotelPrice);
	}

	public void clicklastHotel() throws InterruptedException {
		Thread.sleep(1000);
		int size2 = btnClickContinue.size();
		WebElement btnContinue = btnClickContinue.get(size2 - 1);
		elementClick(btnContinue);
		Thread.sleep(1000);
		confirmAlert();
		Thread.sleep(500);
	}

	public String verifyBookHotelText() {
		String bookHotel = elementGetText(bookHotelTxt);
		String substring = bookHotel.substring(0, 10);
		System.out.println(substring);
		return bookHotel;
	}

	public void secLastHotelName() {
		int size = allHotelName.size();
		WebElement lastHotel = allHotelName.get(size - 2);
		secLastHotelName = lastHotel.getText();
		System.out.println(secLastHotelName);
	}

	public void secLastHotelPrice() {
		int size1 = HotelPrice.size();
		WebElement lastPrice = HotelPrice.get(size1 - 2);
		seclastHotelPrice = lastPrice.getText();
		System.out.println(seclastHotelPrice);
	}

	public void secClicklastHotel() throws InterruptedException {
		int size = btnContinue.size();
		WebElement lastSecConBtn = btnContinue.get(size - 2);
		elementClick(lastSecConBtn);
		confirmAlert();
	}

	public void firstHotelName() {
		WebElement firstHotelName = allHotelName.get(0);
		firstHotelNameSave = firstHotelName.getText();
		System.out.println(firstHotelNameSave);
	}

	public void firstHotelPrice() {
		WebElement firstHotelPrice = HotelPrice.get(0);
		firstHotelPriceSave = firstHotelPrice.getText();
		System.out.println(firstHotelPriceSave);
	}

	public void firstHotelClick() throws InterruptedException {
		int size2 = btnClickContinue.size();
		WebElement btnContinue = btnClickContinue.get(0);
		lastHotelName = btnContinue.getText();
		System.out.println(lastHotelName);
		elementClick(btnContinue);
		Thread.sleep(1000);
		acceptAlert();
	}

}
