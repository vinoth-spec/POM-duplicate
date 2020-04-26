package org.execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dummy {
public static void main(String[] args) throws InterruptedException, AWTException, IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\chromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-table/");
driver.manage().window().maximize();
List<WebElement> row = driver.findElements(By.tagName("tr"));
String data=null;
for(int i=2;i<row.size();i++) {
	List<WebElement> col = row.get(i).findElements(By.tagName("td"));
	for(int j=0;j<col.size();j++) {
		data = col.get(1).getText();
		String data1 = col.get(3).getText();
		System.out.println(data+" "+data1);	
	break;
	}
}
}
}
