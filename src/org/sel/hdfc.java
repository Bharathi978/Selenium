package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
		WebDriver h =new ChromeDriver();
		
		
		
		
		h.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement user = h.findElement(By.xpath("//input[@class='form-control text-muted']"));
		user.sendKeys("sdfghjk");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
