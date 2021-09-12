package org.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.TestClass;

public class BookConfrim extends TestClass {
	public BookConfrim() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@class=\"select_text\"])[1]")public  WebElement bookingid;
	@FindBy(xpath="(//input[@class=\"select_text\"])[2]")public  WebElement HotelName;
	@FindBy(xpath="(//input[@class=\"select_text\"])[3]")public  WebElement Location;
	@FindBy(xpath="(//input[@class=\"select_text\"])[4]")public  WebElement roomcount;
	@FindBy(xpath="(//input[@class=\"select_text\"])[5]")public  WebElement fname;
	@FindBy(xpath="(//input[@class=\"select_text\"])[6]")public  WebElement lname;
}
