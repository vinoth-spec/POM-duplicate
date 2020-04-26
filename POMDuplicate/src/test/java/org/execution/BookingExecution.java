package org.execution;

import org.openqa.selenium.support.ui.Select;
import org.repositary.BookingRepositary;

public class BookingExecution extends BookingRepositary{
public void cardType() {
	Select cardType=new Select(getCardType());
	cardType.selectByVisibleText("VISA");
}
public void expiryDate() {
	Select expiryDate=new Select(getExpireDate());
	expiryDate.selectByVisibleText("March");
}
public void expiryYear() {
	Select expiryYear=new Select(getExpiryYear());
	expiryYear.selectByVisibleText("2022");
}
}
