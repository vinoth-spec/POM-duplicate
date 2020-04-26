package org.execution;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\vinoth\\Desktop\\Book1.xlsx");
	FileInputStream fIS=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fIS);
	XSSFSheet sheet = wb.getSheet("Sheet3");
	String data=null;
	for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		XSSFRow row = sheet.getRow(i);
		for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
			if(row.getCell(j).getStringCellValue().equalsIgnoreCase("us")) {
			data=row.getCell(j).getStringCellValue();
			System.out.println(data);
			}
		}
	}
	}

}

