package org.mouseoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new EdgeDriver();
		
		n.get("https://www.flipkart.com/");
		
		WebElement but = n.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		but.click();
		Thread.sleep(5000);
		
		// more option
		WebElement more = n.findElement(By.xpath("//div[@class='exehdJ']"));
		
	Actions action = new Actions(n);
	action.moveToElement(more).perform();
	
		// 24*7 page
		WebElement click = n.findElement(By.xpath("(//a[@class='_2kxeIr'])[2]"));
		click.click();
		 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
