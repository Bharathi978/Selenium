package org.driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		WebDriver l = new ChromeDriver();
		
		
		l.get("https://www.google.com/");
		
		// right click 
		
		WebElement gmail = l.findElement(By.xpath("//a[text()='Gmail']"));
	
		
		Actions actions = new Actions(l);
		actions.contextClick(gmail).perform();
		
		
	// keyboard	
		Robot k = new Robot();
		Thread.sleep(3000);
		for (int i = 0; i < 2; i++) {
			
			k.keyPress(KeyEvent.VK_DOWN);
			k.keyRelease(KeyEvent.VK_DOWN);}
			
			k.keyPress(KeyEvent.VK_ENTER);
			k.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

