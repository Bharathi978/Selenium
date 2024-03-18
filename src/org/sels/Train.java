package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Train {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	WebDriver j = new ChromeDriver();
	
	
	j.get("https://www.cleartrip.com/trains\r\n" + 
			"");
	
	
	
	WebElement enter = j.findElement(By.xpath("//input[@id='from_station']"));
	enter.sendKeys("Tirunelveli");
	
	
	
	WebElement to = j.findElement(By.xpath("//input[@id='to_station']"));
	to.sendKeys("tambaram");
	
	WebElement clk = j.findElement(By.xpath("//button[@id='trainFormButton']"));
	clk.click();
	
}
	
	
	
	
	
	
	
}
