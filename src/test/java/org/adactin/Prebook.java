package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prebook extends TestClass {

	
	public Prebook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="my_itinerary") WebElement confrim;
}
