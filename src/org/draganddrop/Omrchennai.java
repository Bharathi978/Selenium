package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Omrchennai {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		// To launch the browser
		
				WebDriver l = new ChromeDriver();
		
		// To launch the URL
		
		l.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		
		WebElement string = l.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement d = l.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		
		
		Actions action =new Actions(l);
		
		
		action.dragAndDrop(string, d).perform();
		
		
			
		WebElement st = l.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement st2 = l.findElement(By.id("java-interface"));
		action.dragAndDrop(st, st2).perform();
		
		WebElement st3 = l.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement st4 = l.findElement(By.id("selenium-class"));
		action.dragAndDrop(st3, st4).perform();
		
		
		WebElement st5 = l.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement st6 = l.findElement(By.id("selenium-interface"));
		action.dragAndDrop(st5, st6).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
