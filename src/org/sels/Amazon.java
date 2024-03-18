package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		
		WebDriver k = new ChromeDriver();
		
		
		k.get(" https://www.amazon.in/\r\n" + 
				"");
		WebElement find = k.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		find.sendKeys("phone");
		
		WebElement search = k.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		search.click();
		
		WebElement click = k.findElement(By.xpath("(//img[@class='s-image'])[9]"));
		click.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
