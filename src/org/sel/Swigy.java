package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swigy {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		
		ChromeDriver j = new ChromeDriver();
		
		
		j.get("https://www.swiggy.com/");
		
		
		WebElement user  = j.findElement(By.id("location"));
		
		user.sendKeys("chennai");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
