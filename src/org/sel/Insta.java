package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	
	ChromeDriver h = new ChromeDriver();
	
	
	h.get("https://www.instagram.com/accounts/login/?hl=en) login page \r\n");
	
	WebElement user = h.findElement(By.xpath("//input[@name='username']"));
	user.sendKeys("bharathi");
	
	WebElement pass = h.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("9789268944");
	
	
	WebElement log = h.findElement(By.xpath("(//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm'])[1]"));
	log.click();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
