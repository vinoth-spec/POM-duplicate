package org.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassCreation {
public static WebDriver driver;
public void initDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\chromeDriver\\chromedriver.exe");
}
public void loadDriver() {
	driver=new ChromeDriver();
}
public void loadUrl(String url) {
	driver.get(url);
}
public void windowMaximize() {
	driver.manage().window().maximize();
}
public void typeData(WebElement element, String name) {
	element.sendKeys(name);
}
public void functionClick(WebElement element) {
	element.click();
}
public String getExcelData(int row, int col) throws IOException {
	File f=new File("C:\\Users\\vinoth\\Desktop\\Book1.xlsx");
	FileInputStream fIS=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fIS);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	String data=sheet.getRow(row).getCell(col).getStringCellValue();
	return data;
	}

}
