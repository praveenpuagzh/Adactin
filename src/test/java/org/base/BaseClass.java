package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseClass{
	
	public static void click(WebElement ref) {
		ref.click();
	}
	
	public void selectbyvalue(WebElement ref, String value) {
		Select s = new Select(ref);
		s.selectByValue(value);
		}
		
	public void fillthetext(WebElement ref , String Text) {
	ref.sendKeys(Text);

	}
		
		
}
