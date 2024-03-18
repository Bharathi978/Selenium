package org.windowshandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowsample {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	WebDriver p = new ChromeDriver();

	//URL lanuched
	p.get("https://www.amazon.in/");
	
	
	WebElement txtsearch = p.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	txtsearch.sendKeys("i phone 14");
	
	
	WebElement btnserach = p.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	btnserach.click();
	
	
	WebElement btniphone = p.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	btniphone.click();
	
	Thread.sleep(4000);
	//window switched function
	String par = p.getWindowHandle();
	System.out.println(par);
	
	Set<String> all = p.getWindowHandles();
	System.out.println(all);
	
	
	for (String s : all) {
		if (!par.equals(s)) {
		p.switchTo().window(s);}}
	
	//add cart function
	
		WebElement btnadd = p.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	btnadd.click();
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
