package com.omrbranch.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[contains(text(),'Hotel')]")
	private WebElement txtHotelName;

	@FindBy(xpath = "//strong[@class=\"total-prize\"]")
	private WebElement txtHotelprice;

	@FindBy(xpath = "//div[@id='hotellist']//h5")
	private List<WebElement> allHotelName;

	@FindBy(id = "own")
	private WebElement btnMyself;

	@FindBy(id = "user_title")
	private WebElement salutation;

	@FindBy(id = "first_name")
	private WebElement txtFirstname;

	@FindBy(id = "last_name")
	private WebElement txtLastname;

	@FindBy(id = "user_phone")
	private WebElement txtPhoneno;

	@FindBy(id = "user_email")
	private WebElement txtUseremail;

	@FindBy(id = "gst")
	private WebElement btnGst;

	@FindBy(id = "gst_registration")
	private WebElement txtGstNumber;

	@FindBy(id = "company_name")
	private WebElement txtCompanyName;

	@FindBy(id = "company_address")
	private WebElement txtCompanyAddress;

	@FindBy(id = "step1next")
	private WebElement btnNext;

	@FindBy(id = "smoking")
	private WebElement btnSmoke;

	@FindBy(id = "high")
	private WebElement btnHighFloor;

	@FindBy(id = "other_request")
	private WebElement anyOtherRequest;

	@FindBy(id = "step2next")
	private WebElement btnNext2;

	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement btnPayOptions;

	@FindBy(id = "payment_type")
	private WebElement paymentType;

	@FindBy(id = "card_type")
	private WebElement selectCard;

	@FindBy(id = "card_no")
	private WebElement cardNo;

	@FindBy(id = "card_name")
	private WebElement cardName;

	@FindBy(id = "card_month")
	private WebElement cardMonth;

	@FindBy(id = "card_year")
	private WebElement cardYear;

	@FindBy(id = "cvv")
	private WebElement cardCvv;

	@FindBy(id = "submitBtn")
	private WebElement submitBtn;

	@FindBy(id = "step2next")
	private WebElement splReqNextBtn;

	@FindBy(id = "invalid-payment_type")
	private WebElement paymentTypeError;

	@FindBy(id = "invalid-card_type")
	private WebElement cardTypeError;

	@FindBy(id = "invalid-card_no")
	private WebElement cardNoError;

	@FindBy(id = "invalid-card_name")
	private WebElement cardNameError;

	@FindBy(id = "invalid-card_month")
	private WebElement cardMonthError;

	@FindBy(id = "invalid-cvv")
	private WebElement cardCvvError;

	@FindBy(xpath = "//p[contains(text(),'Bank Account')]")
	private WebElement upiClick;

	@FindBy(id = "upi_id")
	private WebElement upiTextBox;

	@FindBy(id = "invalid-upi")
	private WebElement invalidUpiError;

	public WebElement getInvalidUpiError() {
		return invalidUpiError;
	}

	public WebElement getUpiClick() {
		return upiClick;
	}

	public WebElement getUpiTextBox() {
		return upiTextBox;
	}

	public WebElement getPaymentTypeError() {
		return paymentTypeError;
	}

	public WebElement getCardTypeError() {
		return cardTypeError;
	}

	public WebElement getCardNoError() {
		return cardNoError;
	}

	public WebElement getCardNameError() {
		return cardNameError;
	}

	public WebElement getCardMonthError() {
		return cardMonthError;
	}

	public WebElement getCardCvvError() {
		return cardCvvError;
	}

	public WebElement getSplReqNextBtn() {
		return splReqNextBtn;
	}

	public List<WebElement> getAllHotelName() {
		return allHotelName;
	}

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

	public void guestDetails(String txtsalutation, String firstName, String lastName, String mobile, String email) throws InterruptedException {
		Thread.sleep(1000);
		elementClick(btnMyself);
		elementSendKeys(salutation, txtsalutation);
		elementSendKeys(txtFirstname, firstName);
		elementSendKeys(txtLastname, lastName);
		elementSendKeys(txtPhoneno, mobile);
		elementSendKeys(txtUseremail, email);

	}

	public void gstDetails(String regNo, String companyName, String companyAddress) {
		elementClick(btnGst);
		elementSendKeys(txtGstNumber, regNo);
		elementSendKeys(txtCompanyName, companyName);
		elementSendKeys(txtCompanyAddress, companyAddress);
		elementClick(btnNext);
	}

	public void specialRequest(String specialRequest) {
		elementSendKeys(anyOtherRequest, specialRequest);
		elementClick(btnNext2);
	}

	public void cardPayment() {
		elementClick(btnPayOptions);
	}

	public void cardDetails(String cardType, io.cucumber.datatable.DataTable dataTable) {

	}

	public void submit() {
		elementClick(submitBtn);
	}

	public void nextBtnAfterSplReq() {
		elementClick(splReqNextBtn);
	}

	public void nextBtnWithoutGst() {
		elementClick(btnNext);
	}

	public String paymentErrorMsg() {
		String paymentTypeErrorMsg = elementGetText(paymentTypeError);
		return paymentTypeErrorMsg;
	}

	public String cardTypeError() {
		String cardTypeErrorMsg = elementGetText(cardTypeError);
		return cardTypeErrorMsg;
	}

	public String cardNoError() {
		String cardNoErrorMsg = elementGetText(cardNoError);
		return cardNoErrorMsg;
	}

	public String cardNameError() {
		String cardNameErrorMsg = elementGetText(cardNameError);
		return cardNameErrorMsg;

	}

	public String cardMonthError() {
		String cardMonthErrorMsg = elementGetText(cardMonthError);
		return cardMonthErrorMsg;

	}

	public String cardCvvError() {
		String cardCvvErrorMsg = elementGetText(cardCvvError);
		return cardCvvErrorMsg;
	}

	public void upiId(String upiId) {
		elementClick(upiClick);
		elementSendKeys(upiTextBox, upiId);
	}

	public void upiClick() {
		elementClick(upiClick);
	}

	public String invalidUpi() {
		String invalidUpi = elementGetText(invalidUpiError);
		return invalidUpi;
	}

}
