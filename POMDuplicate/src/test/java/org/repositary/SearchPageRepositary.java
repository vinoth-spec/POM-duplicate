package org.repositary;

import org.execution.HomePageExecution;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageRepositary extends HomePageExecution{
public SearchPageRepositary() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement location;
public WebElement getLocation() {
	return location;
}
public void setLocation(WebElement location) {
	this.location = location;
}
@FindBy(id="hotels")
private WebElement hotel;
public WebElement getHotel() {
	return hotel;
}
public void setHotel(WebElement hotel) {
	this.hotel = hotel;
}
public WebElement getRoomType() {
	return roomType;
}
public void setRoomType(WebElement roomType) {
	this.roomType = roomType;
}
public WebElement getNoOFRomm() {
	return noOFRomm;
}
public void setNoOFRomm(WebElement noOFRomm) {
	this.noOFRomm = noOFRomm;
}
public WebElement getCheckIn() {
	return checkIn;
}
public void setCheckIn(WebElement checkIn) {
	this.checkIn = checkIn;
}
public WebElement getCheckOut() {
	return checkOut;
}
public void setCheckOut(WebElement checkOut) {
	this.checkOut = checkOut;
}
public WebElement getAdultRoom() {
	return adultRoom;
}
public void setAdultRoom(WebElement adultRoom) {
	this.adultRoom = adultRoom;
}
public WebElement getChildRoom() {
	return childRoom;
}
public void setChildRoom(WebElement childRoom) {
	this.childRoom = childRoom;
}
@FindBy(id="room_type")
private WebElement roomType;
@FindBy(id="room_nos")
private WebElement noOFRomm;
@FindBy(id="datepick_in")
private WebElement checkIn;
@FindBy(id="datepick_out")
private WebElement checkOut;
@FindBy(id="adult_room")
private WebElement adultRoom;
@FindBy(id="child_room")
private WebElement childRoom;
@FindBy(id="Submit")
public WebElement submit;
}
