package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	
	ChromeDriver k = new ChromeDriver();
	
		
		k.get(" http://adactinhotelapp.com");
		
		
		WebElement user = k.findElement(By.id("username"));
		
		user.sendKeys("bharathi");
		
		WebElement key = k.findElement(By.name("password"));
		
		key.sendKeys("3456789");
		
		
		WebElement btn = k.findElement(By.xpath("//input[@id='login']"));
		btn.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
