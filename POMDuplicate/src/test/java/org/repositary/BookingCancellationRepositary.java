package org.repositary;

import org.execution.BookingExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingCancellationRepositary extends BookingExecution{
public BookingCancellationRepositary() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="order_id_text")
private WebElement orderNo;
@FindBy(id="search_hotel_id")
private WebElement searchGo;
public WebElement getOrderNo() {
	return orderNo;
}
public void setOrderNo(WebElement orderNo) {
	this.orderNo = orderNo;
}
public WebElement getSearchGo() {
	return searchGo;
}
public void setSearchGo(WebElement searchGo) {
	this.searchGo = searchGo;
}
public WebElement getCancel() {
	return cancel;
}
public void setCancel(WebElement cancel) {
	this.cancel = cancel;
}
public WebElement getCancellall() {
	return cancellall;
}
public void setCancellall(WebElement cancellall) {
	this.cancellall = cancellall;
}
@FindBy(name="ids[]")
private WebElement cancel;
@FindBy(name="cancelall")
private WebElement cancellall;
}
