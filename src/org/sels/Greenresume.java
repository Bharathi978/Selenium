package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenresume {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		WebDriver o = new ChromeDriver();
		
		
		o.get("http://greenstech.in/selenium-course-content.html\r\n" + 
				"");
		
		
		WebElement ent = o.findElement(By.xpath("//div[@id='heading201']"));
		ent.click();
		
		WebElement resu = o.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		resu.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
