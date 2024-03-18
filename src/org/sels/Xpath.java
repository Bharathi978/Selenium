package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		
		WebDriver m = new ChromeDriver();
		
		m.get("https://www.amazon.in/");
		
		WebElement user = m.findElement(By.id("twotabsearchtextbox"));
		user.sendKeys("mobile phone");
		
		WebElement gg = m.findElement(By.id("nav-search-submit-button"));
		gg.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
