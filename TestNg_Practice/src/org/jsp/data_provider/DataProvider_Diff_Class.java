package org.jsp.data_provider;

import org.testng.annotations.Test;

public class DataProvider_Diff_Class {
	
	@Test(dataProvider = "userData",dataProviderClass = Basic_Example.class)
	public void getData(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

}
