package org.fli;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fbloginpojo {
	@FindBy(name ="email")
	private WebElement email;
	@FindBy(id = "m_login_password")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	
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
