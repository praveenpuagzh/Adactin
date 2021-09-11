package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchpage extends TestClass{
	
	public Searchpage() {
	PageFactory.initElements(driver, this);
	}

			@FindBy(name="location") WebElement location;
			@FindBy(name="hotels") WebElement hotels;
			@FindBy(name="room_type") WebElement roomtype;
			@FindBy(name="room_nos") WebElement roomnos;
			@FindBy(name="datepick_in") WebElement datepick_in;
			@FindBy(name="datepick_out") WebElement datepick_out;
			@FindBy(name="adult_room") WebElement adult_room;
			@FindBy(name="child_room") WebElement child_room;
			@FindBy(name="Submit") WebElement submit;
		
			
		
	}


	
