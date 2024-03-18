package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
		WebDriver y = new ChromeDriver();
		
		y.get("https://www.google.co.in/");
		
		WebElement search = y.findElement(By.name("q"));
		
		search.sendKeys("greens technology");
		
		
	}
	
	
	
	
	
	
	
	

}
