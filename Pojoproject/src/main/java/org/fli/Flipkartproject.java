package org.fli;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flipkartproject {
	
	public Flipkartproject() {
	} 
		@FindBy(id="inputEmail")
		private WebElement email;
		@FindBy(xpath= "//input[@type='password']")
		private WebElement password;
		@FindBy(id="submitLogin")
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
	


