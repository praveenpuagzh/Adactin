package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends TestClass {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name") WebElement fname;
	@FindBy(id="last_name") WebElement lname;
	@FindBy(name="address") WebElement address;
	@FindBy(name="cc_num") WebElement ccnum;
	@FindBy(id="cc_type") WebElement cctype;
	@FindBy(id="cc_exp_month") WebElement expmonth;
	@FindBy(id="cc_exp_year") WebElement expyear;
	@FindBy(id="cc_cvv") WebElement cvvnum;
	@FindBy(name="book_now") WebElement booknow;
		
}
