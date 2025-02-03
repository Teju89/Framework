package org.jsp.data_provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Working_with_flipkart {

	@DataProvider(name = "product")
	public Object[][] provideData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "https://www.flipkart.com";
		data[0][1] = "laptops";
		data[1][0] = "https://www.flipkart.com";
		data[1][1] = "Shoes";
		return data;
	}
	
	@Test(dataProvider = "product")
	public void searchProduct(String url, String productName) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(productName);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.ENTER).build().perform();
	}
}












