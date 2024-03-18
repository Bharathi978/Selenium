package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	
	WebDriver h = new ChromeDriver();
	
			
	h.get(" https://www.flipkart.com/");
	
	
	WebElement enter = h.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	enter.sendKeys("9876543210");
	
	
	WebElement pass = h.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	pass.sendKeys("dfghj");
	
	
	WebElement log = h.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
	log.click();
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
