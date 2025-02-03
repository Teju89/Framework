package org.jsp.helper_attributes;

import org.testng.annotations.Test;

public class UsageOfDependsOn {

	@Test
	public void register() {
		System.out.println("Register has been successfully completed...");
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("You have logged in successfully...");
	}
	
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("Searching operation has been done...");
	}
	
	@Test(dependsOnMethods = "search")
	public void subscribe() {
		System.out.println("You have subscribed successfully...");
	}
}
