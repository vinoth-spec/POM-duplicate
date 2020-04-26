package org.execution;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
WebElement source = driver.findElement(By.xpath("(//li[@class='Wbt_B2 _1YVU3_'])[3]"));
Actions acc=new Actions(driver);
acc.moveToElement(source).perform();
driver.findElement(By.xpath("//a[text()='Casio']")).click();
WebElement findElement = driver.findElement(By.className("_3JlYXy"));
String text = findElement.getText();
System.out.println(text);
}
}


