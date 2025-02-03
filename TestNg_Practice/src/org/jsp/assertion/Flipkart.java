package org.jsp.assertion;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Flipkart {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchFlipKart() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}

	//Hard assertion
	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", "title is not matched...");
		
		driver.findElement(By.cssSelector("a[title=Cart]")).click();
		String text = driver.findElement(By.xpath("//div[contains(text(),'Missing')]")).getText();
		
		Assert.assertEquals(text, "Missing Cart items?", "message is not valid...");
	}
	
	//Soft assertion
	@Test
	public void verifyTitle2() {
		String title = driver.getTitle();
		SoftAssert as = new SoftAssert();
		as.assertEquals(title, "FlipKart", "title is not matched...");
		
		driver.findElement(By.cssSelector("a[title=Cart]")).click();
		String text = driver.findElement(By.xpath("//div[contains(text(),'Missing')]")).getText();
		
		as.assertEquals(text, "Missing Cart items?", "message is not valid...");
		
		as.assertAll();
	}
}









