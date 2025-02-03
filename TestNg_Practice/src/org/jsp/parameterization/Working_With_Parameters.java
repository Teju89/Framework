package org.jsp.parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Working_With_Parameters {

	int sum;
	WebDriver driver;
	
//	@Parameters({"num1", "num2"})
	@Test
	public void add(XmlTest test) {
		sum = Integer.parseInt(test.getParameter("num1")) + Integer.parseInt(test.getParameter("num2"));
		System.out.println("Summation = " + sum);
	}
	
	@Parameters({"url","search"})
	@Test
	public void search(String url, String search) {
		driver.get(url);
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		driver.findElement(By.cssSelector("input[value=Search]")).click();
	}
	
	@BeforeMethod
	public void launchDemoapp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
}













