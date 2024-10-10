package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClasses;

public class BookHotelPage extends BaseClasses {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[text()='Book Hotel - Hyatt Regency Chennai Suite']")
	private WebElement txtHotelName;
	
	@FindBy(xpath="//strong[text()='$ 6,136']")
	private WebElement txtHotelprice;
	
	
	@FindBy(id="own")
	private WebElement btnMyself;
	
	@FindBy(id="user_title")
	private WebElement salutation;
	
	@FindBy(id="first_name")
	private WebElement txtFirstname;
	
	@FindBy(id="last_name")
	private WebElement txtLastname;
	
	@FindBy(id="user_phone")
	private WebElement txtPhoneno;
	
	@FindBy(id="user_email")
	private WebElement txtUseremail;
	
	@FindBy(id="gst")
	private WebElement btnGst;
	
	@FindBy(id="gst_registration")
	private WebElement txtGstNumber;
	
	@FindBy(id="company_name")
	private WebElement txtCompanyName;
	
	@FindBy(id="company_address")
	private WebElement txtCompanyAddress;
	
	@FindBy(id="step1next")
	private WebElement btnNext;
	
	@FindBy(id="smoking")
	private WebElement btnSmoke;
	
	@FindBy(id="high")
	private WebElement btnHighFloor;
	
	@FindBy(id="other_request")
	private WebElement anyOtherRequest;
	
	@FindBy(id="step2next")
	private WebElement btnNext2;
	
	@FindBy(xpath="//div[@class='credit-card pm']")
	private WebElement btnPayOptions;
	
	@FindBy(id="payment_type")
	private WebElement paymentType;
	
	@FindBy(id="card_type")
	private WebElement selectCard;
	
	@FindBy(id="card_no")
	private WebElement cardNo;
	
	@FindBy(id="card_name")
	private WebElement cardName;
	
	@FindBy(id="card_month")
	private WebElement cardMonth;
	
	@FindBy(id="card_year")
	private WebElement cardYear;
	
	@FindBy(id="cvv")
	private WebElement cardCvv;
	
	@FindBy(id="submitBtn")
	private WebElement submitBtn;

	public WebElement getBtnMyself() {
		return btnMyself;
	}

	public WebElement getSalutation() {
		return salutation;
	}

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtPhoneno() {
		return txtPhoneno;
	}

	public WebElement getTxtUseremail() {
		return txtUseremail;
	}

	public WebElement getBtnGst() {
		return btnGst;
	}

	public WebElement getTxtGstNumber() {
		return txtGstNumber;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}

	public WebElement getBtnNext() {
		return btnNext;
	}

	public WebElement getBtnSmoke() {
		return btnSmoke;
	}

	public WebElement getBtnHighFloor() {
		return btnHighFloor;
	}

	public WebElement getAnyOtherRequest() {
		return anyOtherRequest;
	}

	public WebElement getBtnNext2() {
		return btnNext2;
	}

	public WebElement getBtnPayOptions() {
		return btnPayOptions;
	}

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getSelectCard() {
		return selectCard;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getCardMonth() {
		return cardMonth;
	}

	public WebElement getCardYear() {
		return cardYear;
	}

	public WebElement getCardCvv() {
		return cardCvv;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getTxtHotelName() {
		return txtHotelName;
	}

	public WebElement getTxtHotelprice() {
		return txtHotelprice;
	}
}
