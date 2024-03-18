package org.mouseoveraction;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) throws AWTException, InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
		
		n.get("https://www.amazon.in/");
		
		
	n.manage().window().maximize();
		
   Actions act = new Actions(n);

	WebElement prime = n.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
	act.moveToElement(prime).perform();
		
		
		Thread.sleep(3000);
		
		
		
		WebElement imc = n.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		imc.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
