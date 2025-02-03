package org.jsp.parallel_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubscribeTestCase {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void subscribe(String browser) {
		System.out.println(browser);
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + browser);
		}

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");

		driver.findElement(By.id("newsletter-email")).sendKeys("teju12@gmail.com");
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		driver.close();
	}
}
