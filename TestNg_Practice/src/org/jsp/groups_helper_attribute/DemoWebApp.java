package org.jsp.groups_helper_attribute;

import org.testng.annotations.Test;

public class DemoWebApp {

	@Test(groups = "SmokeTest")
	public void loginOperation() {
		System.out.println("This is login Operation...");
	}
	
	@Test
	public void RegisterOperation() {
		System.out.println("This is register Operation...");
	}
}
