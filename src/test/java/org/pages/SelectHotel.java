package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.test.TestClass;

public class SelectHotel extends TestClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="radiobutton_0") public WebElement checkbutton;
	@FindBy(name="continue") public WebElement press;
}
