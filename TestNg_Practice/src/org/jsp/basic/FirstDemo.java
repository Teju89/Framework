package org.jsp.basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

//Test class
public class FirstDemo {

	//Test case
	@Test
	public void run() {
		//Test steps
		Reporter.log("Run");
		System.out.println("This is run method...");
	}
	
	@Test
	public void sleep() {
		System.out.println("This is sleep method...");
	}
}
