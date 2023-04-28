package org.sam;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class Runnerclass  {

	@Test
	public void tc() {
		Result rc = JUnitCore.runClasses(B.class,Samplejunit.class,A.class);
		System.out.println("Total Test case Runcount:" + rc.getRunCount());
		System.out.println("Total Test case Runtime:"+ rc.getRunTime());
		System.out.println("Total Test case Failedcount:"+rc.getFailureCount());
		System.out.println("Total Test case Ingnorecount:"+rc.getIgnoreCount());
		List<Failure> failures = rc.getFailures();
		
	for (Failure fails : failures) {
		System.out.println(fails);
		
	}

	}
	

}
