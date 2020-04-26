package org.repositary;

import org.execution.SearchPageExecution;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectRepositary extends SearchPageExecution{
public SelectRepositary() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
public WebElement radioButton;
@FindBy(id="continue")
public WebElement continueButton;
}
