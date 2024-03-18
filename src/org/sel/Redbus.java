package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.deiver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver u = new ChromeDriver();
		
		u.get("https://www.redbus.in/");
		
		WebElement area = u.findElement(By.id("src"));
		
		area.sendKeys("Tirunelveli");
		
		WebElement to = u.findElement(By.id("dest"));
		
		to.sendKeys("Tambaram");
	}
	
	
	
	
	
	
	
	

}
