package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	
	ChromeDriver g = new ChromeDriver();
	
		
		
		g.get("http://demo.automationtesting.in/Register.html\r\n");
		
		
		
		
		WebElement first = g.findElement(By.xpath("//input[@placeholder='First Name']"));
		first.sendKeys("sharathi");
	
		
		WebElement last = g.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("bharathi");
		
		
		WebElement add = g.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		add.sendKeys("34 spk st tirunelveli");
		
		WebElement email = g.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sharathibharathi@gmail.com");
		
		WebElement phone = g.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9789268944");
		
		WebElement gen = g.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gen.click();
		
		WebElement hob = g.findElement(By.xpath("//input[@value='Movies']"));
		hob.click();
		Thread.sleep(2000);
	
		WebElement lang = g.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		lang.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
