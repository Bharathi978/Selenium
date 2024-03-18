
package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swigyxpath {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	
	WebDriver  l = new ChromeDriver();
	
	
	
	l.get(" https://www.swiggy.com/");
	
	
	WebElement flt = l.findElement(By.xpath("//div[@class='_2fX4J']"));
	flt.click();
	
	
	WebElement in = l.findElement(By.xpath("//input[@class='_381fS']"));
	in.sendKeys("9789267983");
	
	WebElement name = l.findElement(By.xpath("(//input[@class='_381fS'])[2]"));
	name.sendKeys("bharathi");
	
	
	
	WebElement email = l.findElement(By.xpath("(//input[@class='_381fS'])[3]"));
	email.sendKeys("sharathibharathi@gmail.com");
	
	
	
	WebElement bt = l.findElement(By.xpath("//div[@class='_25qBi _2-hTu']"));
	bt.click();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
