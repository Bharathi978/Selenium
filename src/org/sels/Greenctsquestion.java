package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenctsquestion {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		WebDriver k = new ChromeDriver();
		
		
		k.get("http://greenstech.in/selenium-course-content.html");
		
		
		WebElement search = k.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		search.click();
		
		WebElement cts = k.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		cts.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
