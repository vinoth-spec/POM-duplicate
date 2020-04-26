package org.repositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.util.BaseClassCreation;

public class HomePageRepositary extends BaseClassCreation{
public HomePageRepositary() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement username;
@FindBy(id="password")
private WebElement password;
@FindBy(id="login")
public WebElement login;
public WebElement getUsername() {
	return username;
}
public void setUsername(WebElement username) {
	this.username = username;
}
public WebElement getPassword() {
	return password;
}
public void setPassword(WebElement password) {
	this.password = password;
}
}
