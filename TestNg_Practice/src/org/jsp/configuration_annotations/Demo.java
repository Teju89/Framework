package org.jsp.configuration_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite method has been executed successfully...");
	}
	
	@Test
	public void coreTest() {
		System.out.println("Core test has been executed successfully...");
	}
	
	@Test
	public void coreTest2() {
		System.out.println("Core test 2 has been executed successfully...");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite method has been executed successfully...");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test method has been executed successfully...");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test method has been executed successfully...");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method  has been executed successfully...");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method  has been executed successfully...");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class method has been executed successfully...");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class method has been executed successfully...");
	}
	
}
