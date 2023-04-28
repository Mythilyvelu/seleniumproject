package org.exc;

import java.util.Date;

import org.apache.hc.core5.reactor.Command.Priority;
import org.exc.Baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testannotation extends Baseclass {
	@BeforeClass
	private void launchBrowser() {
		launchbrowser();
		WindowMaximize();

	}
	
	
	@Test(priority = -5)
	private void tc1( ) {
		launchurl("https://mail.google.com/");

	}
	@Test(priority = -3)
	private void tc3() {
		launchurl("https://www.inmakeslh.in/");

	}
	@Test(priority = 0)
	private void tc6() {
		launchurl("https://www.redbus.in/");

	}
	@Test(priority = 4)
	private void tc7() {
		launchurl("https://www.flipkart.com/");

	}
	@Test(priority = -1)
	private void tc10() {
		launchurl("https://www.amazon.in/");

	}
	@Test(priority = 4)
	private void tc12() {
		launchurl("https://www.youtube.com/");

	}
	@Test(priority = 8)
	private void tc18() {
		launchurl("https://www.facebook.com/");
		Fbloginpojo f = new Fbloginpojo();
		passtext("mythilyvelu982@gamil.com",f.getEmail() );
         passtext("mythily2777", f.getPassword());
	}
     @BeforeMethod
     private void StartDate() {
     Date d = new Date();
     System.out.println(d);
     
     }
     @AfterMethod
     private void endDate() {
    	 Date d = new Date();
         System.out.println(d);
         

	}
     @AfterClass
     private void closeBrowser() {
		closeEntireBrowser();

	}
	

}
