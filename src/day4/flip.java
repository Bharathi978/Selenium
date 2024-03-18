package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flip {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	WebDriver l = new ChromeDriver();
	
	l.get("https://www.flipkart.com/ ");
	
	WebElement se = l.findElement(By.xpath("(//input[@type='text'])[2]"));
	se.sendKeys("1234567890");
	
	WebElement close = l.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	close.click();
	WebElement txt = l.findElement(By.xpath("//input[@class='_3704LK']"));
	txt.sendKeys("cycle");
	
	WebElement btn = l.findElement(By.xpath("//button[@class='L0Z3Pu']"));
	btn.click();
	Thread.sleep(2000);
	WebElement selet = l.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]"));
	selet.click();
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
}
