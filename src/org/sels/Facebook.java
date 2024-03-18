package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver j = new ChromeDriver();
		
		j.get(" https://www.facebook.com");
		
		
		WebElement user = j.findElement(By.xpath("//input[@name=\"email\"]"));
		user.sendKeys("sharathi");
		
		
		WebElement pass = j.findElement(By.xpath("//input[@id=\"pass\"]"));
		pass.sendKeys("345678932");
		
		
		WebElement butt = j.findElement(By.xpath("//button[@value=\"1\"]"));
		
		butt.click();
		
		
		
		
		String string = j.getCurrentUrl();
		
		System.out.println(string); 
		
		
		
		String title = j.getTitle();
		
		System.out.println(title);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
