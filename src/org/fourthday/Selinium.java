package org.fourthday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selinium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver h = new ChromeDriver();
		
		h.get("http://greenstech.in/selenium-course-content.html");
		
		
		
		WebElement search = h.findElement(By.xpath("//span[@class='fas fa-user']"));
		search.click();
		
		WebElement clc = h.findElement(By.xpath("//h3[@id='heading661']"));
		clc.click();
		
	WebElement cop = h.findElement(By.xpath("(//div[contains(@class,'collapse show')])[1]"));
	String text = cop.getText();
	System.out.println(text);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
