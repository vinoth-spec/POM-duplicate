package org.execution;

import org.openqa.selenium.support.ui.Select;
import org.repositary.SearchPageRepositary;

public class SearchPageExecution extends SearchPageRepositary{
	public void location() {
	Select loc=new Select(getLocation());
	loc.selectByVisibleText("London");
}
	public void hotel() {
		Select hotel=new Select(getHotel());
		hotel.selectByVisibleText("Hotel Cornice");
	}
	public void roomType() {
		Select roomType=new Select(getRoomType());
		roomType.selectByVisibleText("Deluxe");
	}
	public void noOFRoom() {
		Select noOfRoom=new Select(getNoOFRomm());
		noOfRoom.selectByVisibleText("2 - Two");
	}
	public void adultPerRoom() {
		Select adultPerRoom=new Select(getAdultRoom());
		adultPerRoom.selectByVisibleText("3 - Three");
	}
	public void childPerRoom() {
		Select childPerRoom=new Select(getChildRoom());
		childPerRoom.selectByVisibleText("2 - Two");
	}
}
