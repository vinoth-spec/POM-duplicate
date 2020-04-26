package org.execution;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CheapAir {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\vinoth\\eclipse-workspace\\POMDuplicate\\chromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
WebElement findElement = driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
Object name = js.executeScript("arguments[0].setAttribute('value','vinoth.sify')",findElement);
String name1=(String)js.executeScript("return arguments[0].getAttribute('value')",name);
System.out.println(name1);
}
}
	