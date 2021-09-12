package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.TestClass;

public class Prebook extends TestClass {

	
	public Prebook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="my_itinerary") public WebElement confrim;
}
