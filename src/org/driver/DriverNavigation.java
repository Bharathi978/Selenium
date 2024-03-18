package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		
		l.navigate().to("https://www.facebook.com/");
		
		l.navigate().to("https://www.youtube.com/premium");
		
		l.navigate().to("https://www.instagram.com/");
		
		l.navigate().to("https://twitter.com/i/flow/login");
		
		
		l.navigate().back();
		l.navigate().back();
		l.navigate().forward();
		l.navigate().forward();
		l.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
