package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.TestClass;

public  class loginpage extends TestClass  {

	public loginpage() {
	PageFactory.initElements(driver, this);
	}
	
@FindBy(id="username")  public WebElement  uname;
@FindBy(name="password")public WebElement pass;
@FindBy(name="login") public WebElement login;

}