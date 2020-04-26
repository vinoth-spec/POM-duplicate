package org.execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EastSky {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\chromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.esky.com/");
	driver.findElement(By.xpath("//a[text()='Accept']")).click();
	driver.manage().window().maximize();
	Thread.sleep(7000);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ESCAPE);
	r.keyRelease(KeyEvent.VK_ESCAPE);
	driver.findElement(By.xpath("(//input[@class='destination'])[1]")).sendKeys("Chennai, Chennai Intl Airport, Tamil Nadu, India (MAA)");
	driver.findElement(By.xpath("(//input[@class='destination'])[2]")).sendKeys("Bangkog - All Airports (BANG)");
}
}
