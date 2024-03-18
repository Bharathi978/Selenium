package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	ChromeDriver d = new ChromeDriver();
	
	
	
		
		d.get("https://www.snapdeal.com/login");
		
		WebElement user = d.findElement(By.className("col-xs-24"));
		
		
		user.sendKeys("sharathi2");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
