package org.jsp.data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basic_Example {

	@DataProvider(name = "userData")
	public Object[][] provideData(){
		Object[][] arr = new Object [2][2];
		arr[0][0] = "Tejal";
		arr[0][1] = "Sonawane";
		arr[1][0] = "Harshal";
		arr[1][1] = "Sonawane";
		return arr;
	}
	
	@Test(dataProvider = "userData")
	public void getData(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
}
