package org.jsp.helper_attributes;

import org.testng.annotations.Test;

/**
 * By default priority of execution is alphabetical order 
 * Testers can modify it by using priority attributes
 */
public class UsageOfPriority {

	@Test(priority = 1)
	public void register() {
		System.out.println("Register has been successfully completed...");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("You have logged in successfully...");
	}
	
	@Test(priority = 4)
	public void search() {
		System.out.println("Searching operation has been done...");
	}
	
	@Test(priority = 3)
	public void subscribe() {
		System.out.println("You have subscribed successfully...");
	}
}
