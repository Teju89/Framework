package org.jsp.groups_helper_attribute;

import org.testng.annotations.Test;

public class DemoWebApp2 {

	@Test
	public void searchOperation() {
		System.out.println("This is search Operation...");
	}
	
	@Test(groups = "SmokeTest")
	public void subscribeOperation() {
		System.out.println("This is subscribe Operation...");
	}
}
