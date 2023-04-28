package org.exc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fbloginpojo {
	@FindBy(name ="email")
	public WebElement email;
	@FindBy(id = "m_login_password")
	public WebElement password;
	@FindBy(name="login")
	public WebElement login;
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}

}
