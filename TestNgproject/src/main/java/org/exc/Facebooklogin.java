package org.exc;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Facebooklogin extends Baseclass {
	@BeforeClass
	private void Launchbrowser() {
		launchbrowser();
		WindowMaximize();

	

	}
	@Test
	public void tc1() {
		launchurl("https://en-gb.facebook.com/");
		Fbloginpojo f = new Fbloginpojo();
		passtext("mythilyvelu982@gmail.com", f.getEmail());
		passtext("mythily277", f.getPassword());

	}
	
	

}
