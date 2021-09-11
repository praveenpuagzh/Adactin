package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class loginpage extends TestClass  {

	public loginpage() {
	PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")  WebElement  uname;
@FindBy(name="password") WebElement pass;
@FindBy(name="login") WebElement login;

}