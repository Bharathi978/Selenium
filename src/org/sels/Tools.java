package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tools {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		
		
		k.get("http://toolsqa.com/automation-practice-form");
		
		
		WebElement sele = k.findElement(By.xpath("//a[@href='/selenium-training?q=headers']"));
		sele.click();
		
		WebElement reg = k.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		reg.click();
		
		WebElement first = k.findElement(By.xpath("//input[@name='firstName']"));
		first.sendKeys("Bharathi");
		
		WebElement last = k.findElement(By.xpath("//input[@name='lastName']"));
		last.sendKeys("sharu");
		
		WebElement mail = k.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("sharathibharthi@gmail.com");
		
		WebElement mob = k.findElement(By.xpath("//input[@name='mobile']"));
		mob.sendKeys("9789268944");
		
		WebElement clk = k.findElement(By.xpath("//option[@value='4']"));
		clk.click();
		
		WebElement city = k.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("tirunelveli");
		
		WebElement text = k.findElement(By.xpath("//textarea[@name='message']"));
		text.sendKeys("iam bharathi");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
