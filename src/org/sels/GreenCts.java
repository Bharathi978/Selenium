package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.criver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		
		WebDriver m = new ChromeDriver();
		
		m.get("http://greenstech.in/selenium-course-content.html\r\n" + 
				"");
		

		WebElement click = m.findElement(By.xpath("//a[@id='overview-tab']"));
		click.click();
	WebElement word = m.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium')]"));
	String text = word.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
