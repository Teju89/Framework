package org.jsp.parallel_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchTestCase {

	WebDriver driver;

	@Parameters("browser")
	@Test
	public void search(String browser) {
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

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com");

		driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
		driver.findElement(By.cssSelector("input[value=Search]")).click();
		driver.close();
	}
}
