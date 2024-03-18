package org.fourthday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoncontain {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
			
	
	WebDriver n = new ChromeDriver();
	
	
	n.get("https://www.amazon.in/");
		
		WebElement fid = n.findElement(By.xpath("(//a[contains(@class,'nav_a')])[49]"));
		
		String text = fid.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
