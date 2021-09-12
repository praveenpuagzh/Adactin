package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.test.TestClass;

public class Searchpage extends TestClass{
	
	public Searchpage() {
	PageFactory.initElements(driver, this);
	}

	@FindBy(name="location")    public WebElement location;
	@FindBy(name="hotels")      public WebElement hotels;
	@FindBy(name="room_type")   public WebElement roomtype;
	@FindBy(name="room_nos")    public WebElement roomnos;
	@FindBy(name="datepick_in") public WebElement datepick_in;
	@FindBy(name="datepick_out")public  WebElement datepick_out;
	@FindBy(name="adult_room")  public WebElement adult_room;
	@FindBy(name="child_room")  public WebElement child_room;
	@FindBy(name="Submit")      public WebElement submit;
		
			
		
	}


	
