package org.jsp.helper_attributes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsageOfThreadPoolAndInvocationCount {

	@Test(invocationCount = 2, threadPoolSize = 1)
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio']"));
		
		elements.stream()
				.forEach(t -> {
					t.click();
					driver.findElement(By.cssSelector("input[value=Vote]")).click();
				});
	}
}





