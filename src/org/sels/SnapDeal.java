package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\src\\org\\sels\\SnapDeal.java");
		
		WebDriver l = new ChromeDriver();
		
		l.get("https://www.snapdeal.com/");
		
		WebElement search = l.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		search.click();
		
		WebElement reg = l.findElement(By.xpath("//span[@class='newUserRegister']"));
		reg.click();
		
		
		Thread.sleep(2000);
		
		WebElement enter = l.findElement(By.xpath("//input[@id='userName']"));
		enter.sendKeys("sharathibharathi@gmail.com");
		
		
		WebElement btn = l.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		btn.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
