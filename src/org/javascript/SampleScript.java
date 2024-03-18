package org.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		WebDriver h  = new ChromeDriver();
		
		h.get("https://www.facebook.com/");
		
		JavascriptExecutor k = (JavascriptExecutor)h;
		
		
		WebElement txtuser = h.findElement(By.id("email"));
		k.executeScript("arguments[0].setAttribute('value','bharathibharathi@gmail.com')", txtuser);
		
		// mail print
		
		Object text = k.executeScript("return arguments[0].getAttribute('value')", txtuser);
		String textted= (String) text;
		System.out.println(textted);
		
	
		
		Thread.sleep(1000);
		WebElement pass = h.findElement(By.id("pass"));
		k.executeScript("arguments[0].setAttribute('value','9789473373')", pass);
		
		Object pa = k.executeScript("return arguments[0].getAttribute('value')", pass);
		String po=(String)pa;
		System.out.println(po);
		
		WebElement log = h.findElement(By.name("login"));
		k.executeScript("arguments[0].click()", log);
		
		
	} 
	
	
	
	
	

}
