package org.execution;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenShot {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table");
	driver.manage().window().maximize();
List<WebElement> trow = driver.findElements(By.tagName("tr"));
String data=null;
String data1=null;
for(int i=2;i<trow.size();i++) {
	List<WebElement> tdata = trow.get(i).findElements(By.tagName("td"));
	for(int j=0;j<tdata.size();j++) {
		data = tdata.get(0).getText();
		data1 = tdata.get(3).getText();
		System.out.println(data+"   "+data1);
		break;
	}
}
	
}
}