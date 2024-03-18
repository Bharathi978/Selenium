package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\Selenium tail\\driver\\chromedriver.exe");
		
		WebDriver m = new ChromeDriver();
		
		
		m.get("https://infinity.icicibank.com/corp/Login.jsp\r\n" + 
				"");
		
	

	WebElement click = m.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]"));
	click.click();
	
	WebElement user = m.findElement(By.xpath("//input[@class='login-input type_UserPrincipal']"));
	user.sendKeys("987654321");
	
	WebElement pass = m.findElement(By.xpath("(//input[@type='password'])[4]"));
	pass.sendKeys("sdfghjk6789");
	
	WebElement btn = m.findElement(By.xpath("//input[@value='Login']"));
	btn.click();
	
	
	
}
}