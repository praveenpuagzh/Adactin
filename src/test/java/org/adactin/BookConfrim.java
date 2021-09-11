package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfrim extends TestClass {
	public BookConfrim() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class=\"select_text\"])[1]") WebElement bookingid;
	@FindBy(xpath="(//input[@class=\"select_text\"])[2]") WebElement HotelName;
	@FindBy(xpath="(//input[@class=\"select_text\"])[3]") WebElement Location;
	@FindBy(xpath="(//input[@class=\"select_text\"])[4]") WebElement roomcount;
	@FindBy(xpath="(//input[@class=\"select_text\"])[5]") WebElement fname;
	@FindBy(xpath="(//input[@class=\"select_text\"])[6]") WebElement lname;
}
