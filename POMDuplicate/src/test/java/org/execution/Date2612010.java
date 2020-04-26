package org.execution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date2612010 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\chromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.toolsqa.com/automation-practice-table");
driver.manage().window().maximize();
List<WebElement> row = driver.findElements(By.tagName("tr"));
String s=null;
for(int i=0;i<row.size();i++) {
	List<WebElement> data = row.get(i).findElements(By.tagName("td"));
	for(int j=0;j<data.size();j++) {
		if(data.get(j).getText().equals("Saudi Arabia")) {
			s=data.get(4).getText();
			System.out.println(s);
		}
	}
	
}
}
}
