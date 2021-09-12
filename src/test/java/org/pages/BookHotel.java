package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.TestClass;

public class BookHotel extends TestClass {

	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name") public WebElement fname;
	@FindBy(id="last_name") public WebElement lname;
	@FindBy(name="address") public WebElement address;
	@FindBy(name="cc_num") 	public WebElement ccnum;
	@FindBy(id="cc_type") 	public WebElement cctype;
	@FindBy(id="cc_exp_month") public WebElement expmonth;
	@FindBy(id="cc_exp_year") public WebElement expyear;
	@FindBy(id="cc_cvv") 	public WebElement cvvnum;
	@FindBy(name="book_now") public WebElement booknow;
}
