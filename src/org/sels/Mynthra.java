package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	WebDriver l = new ChromeDriver();
	
	
	l.get(" https://www.myntra.com/register?referer=https://www.myntra.com/");
	l.manage().window().maximize();
	l.navigate().refresh();
	WebElement enter = l.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	enter.sendKeys("9789268944");
	
	WebElement findElement = l.findElement(By.xpath("//div[@class='submitBottomOption']"));
	
	 findElement.click();
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
