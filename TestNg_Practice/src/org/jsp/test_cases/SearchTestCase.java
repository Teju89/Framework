package org.jsp.test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTestCase {

	@Test
	public void search() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		driver.findElement(By.cssSelector("input[value=Search]")).click();
		driver.close();
	}
}
