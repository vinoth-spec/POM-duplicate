package org.execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

public class Fb {
public static void main(String[] args) throws AWTException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/?xtor=SEC-1064[Generic+Keywords-EM]-MSN-[Bus+Pune]--S-redbus&msclkid=cbef58414f6314896dc005a49378e02");
	driver.manage().window().maximize();
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.xpath("(//span[@class='offer-img'])[1]")).click();
	driver.findElement(By.xpath("(//span[@class='offer-img'])[2]")).click();
	driver.findElement(By.xpath("(//span[@class='offer-img'])[3]")).click();
	
}


}
