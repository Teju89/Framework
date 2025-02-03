package org.jsp.test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SubscribeTestCase {

	@Test
	public void subscribe() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("newsletter-email")).sendKeys("teju12@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.close();
	}
}
