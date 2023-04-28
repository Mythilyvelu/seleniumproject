package org.sam;

import static org.junit.Assert.assertTrue;

import org.exc.Baseclass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAssert extends Baseclass {
	@BeforeClass
	public static void launchBrowser() {
		launchbrowser();
		WindowMaximize();	 

	}
	@Test
	public void tc1() {
		System.out.println("Testcase1");
		launchurl("https://mail.google.com");
		String title = pagetitle();
		String pageurl = pageurl();
		Assert.assertTrue("Check PageTittle",title.contains("gmail") );
		Assert.assertEquals("check Pageurl", pageurl, pageurl.contains("gmail"));
		

	}
	

}
