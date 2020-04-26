package org.execution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.repositary.BookingCancellationRepositary;
import org.repositary.BookingRepositary;
import org.repositary.HomePageRepositary;
import org.repositary.SearchPageRepositary;
import org.repositary.SelectRepositary;

public class Execution extends BookingCancellationExecution{
	public static void main(String[] args) throws IOException, InterruptedException {
	Execution e=new Execution();
	e.initDriver();
	e.loadDriver();
	e.loadUrl("https://www.adactin.com/HotelApp/index.php");
	e.windowMaximize();
	HomePageRepositary hPR=new HomePageRepositary();
	e.typeData(hPR.getUsername(), e.getExcelData(0, 3));
	e.typeData(hPR.getPassword(), e.getExcelData(1, 3));
	e.functionClick(hPR.login);
	SearchPageExecution sPE=new SearchPageExecution();
	sPE.location();
	sPE.hotel();
	sPE.roomType();
	sPE.noOFRoom();
	sPE.adultPerRoom();
	sPE.childPerRoom();
	sPE.getCheckIn().clear();
	sPE.getCheckOut().clear();
	SearchPageRepositary sPR=new SearchPageRepositary();
	e.typeData(sPR.getCheckIn(), e.getExcelData(7, 0));
	e.typeData(sPR.getCheckOut(), e.getExcelData(8, 0));
	e.functionClick(sPR.submit);
	SelectRepositary sR=new SelectRepositary();
	e.functionClick(sR.radioButton);
	e.functionClick(sR.continueButton);
	BookingRepositary bR=new BookingRepositary();
	e.typeData(bR.getName(), e.getExcelData(0, 5));
	e.typeData(bR.getLastName(), e.getExcelData(1, 5));
	e.typeData(bR.getAddress(), e.getExcelData(2, 5));
	e.typeData(bR.getCardNo(), e.getExcelData(3, 5));
	e.typeData(bR.getCvv(), e.getExcelData(4, 5));
	BookingExecution bE=new BookingExecution();
	bE.cardType();
	bE.expiryDate();
	bE.expiryYear();
	e.functionClick(bR.bookNow);
	Thread.sleep(7000);
	e.cancel();
	e.functionClick(bR.confirmHotel);
	BookingCancellationRepositary bCR=new BookingCancellationRepositary();
	e.typeData(bCR.getOrderNo(), e.getOrderId(0, 0));
	bCR.getSearchGo().click();
	bCR.getCancel().click();
	bCR.getCancellall().click();
	e.errorPopup();
	}

	
	}
