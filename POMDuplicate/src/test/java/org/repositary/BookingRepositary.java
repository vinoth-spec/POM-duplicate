package org.repositary;

import org.execution.SelectExecution;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingRepositary extends SelectExecution{
	public BookingRepositary() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	public void setName(WebElement name) {
		this.name = name;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public void setCardNo(WebElement cardNo) {
		this.cardNo = cardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public void setCardType(WebElement cardType) {
		this.cardType = cardType;
	}
	public WebElement getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(WebElement expireDate) {
		this.expireDate = expireDate;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(WebElement expiryYear) {
		this.expiryYear = expiryYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}
	@FindBy(id="last_name")
	private WebElement lastName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardNo;
	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement expireDate;
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	public WebElement bookNow;
	@FindBy(id="my_itinerary")
	public WebElement confirmHotel;
}
