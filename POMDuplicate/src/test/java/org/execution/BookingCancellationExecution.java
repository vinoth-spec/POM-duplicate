package org.execution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.repositary.BookingCancellationRepositary;

public class BookingCancellationExecution extends BookingCancellationRepositary{
	/*BookingCancellationExecution bCE=new BookingCancellationExecution();*/
	public void cancel() throws IOException  {
		WebElement findElement = driver.findElement(By.id("order_no"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String name=(String)js.executeScript("return arguments[0].value",findElement);
		System.out.println(name);
		File f=new File("C:\\Users\\vinoth\\Desktop\\Book1.xlsx");
		FileInputStream fIS=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fIS);
		XSSFSheet sheet = wb.getSheet("Sheet3");
		XSSFRow cRow = sheet.createRow(0);
		XSSFCell cdata = cRow.createCell(0);
		cdata.setCellValue(name);
		FileOutputStream fOS=new FileOutputStream(f);
		wb.write(fOS);
		System.out.println("Task Completed");
	}
	public String getOrderId(int row, int col) throws IOException {
		File f=new File("C:\\Users\\vinoth\\Desktop\\Book1.xlsx");
		FileInputStream fIS=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fIS);
		XSSFSheet sheet=wb.getSheet("Sheet3");
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
		}
	public void errorPopup() {
		driver.switchTo().alert().accept();
	}
	}


