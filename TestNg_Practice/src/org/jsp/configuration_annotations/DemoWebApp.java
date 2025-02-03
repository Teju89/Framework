package org.jsp.configuration_annotations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebApp {

	WebDriver driver;
	Actions actions;

	@BeforeMethod
	public void launchFlipkart() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Flipkart has been launched successfully!!!");
	}

	@Test
	public void displayAllElectornics() {
		actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.cssSelector("div[aria-label=Electronics]"))).build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'More')]/following-sibling::a")))
		.click().build().perform();
		System.out.println("Electronics");
	}
	
	@Test
	public void flightTickets() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.findElement(By.xpath("//span[contains(text(),'Flight')]")).click();
		driver.findElement(By.xpath("//div/input[@type='text']")).sendKeys("Mumbai");
		actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'BOM')]"))).click().build().perform(); 
		driver.findElement(By.xpath("//label[contains(text(),'To')]/preceding-sibling::input")).sendKeys("Hyderabad");
		actions.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Popular')]/following-sibling::div/following-sibling::div"))).click().build().perform();
		driver.findElement(By.xpath("//span[text()='SEARCH']")).click();
		System.out.println("flight");
	}

	@AfterMethod
	public void closeFlipkart() {
		driver.quit();
		System.out.println("Flipkart has been closed successfully!!!");
	}
}
