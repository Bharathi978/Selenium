package org.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleframe {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		
		WebDriver k = new ChromeDriver();
		
		
		k.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		
//frame switch
		
		k.switchTo().frame(0);
		
		WebElement txttopic = k.findElement(By.tagName("input"));
		txttopic.sendKeys("Java course");
		
		
		k.switchTo().frame("frame3");
	
		WebElement chkbox = k.findElement(By.id("a"));
		chkbox.click();
		
// main switch
		k.switchTo().defaultContent();
		
		List<WebElement> totalframe = k.findElements(By.tagName("iframe"));
		System.out.println(totalframe.size());
		
		k.switchTo().frame("frame2");
		
		WebElement find = k.findElement(By.id("animals"));
	    find.click();
	
		WebElement select = k.findElement(By.xpath("//option[@value='babycat']"));
		select.click();
		System.out.println(select.getText());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
