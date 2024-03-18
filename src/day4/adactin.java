package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adactin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
	l.get("http://adactinhotelapp.com/");	

		WebElement user = l.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("SHARATHI97");
		
	// print valve
		
		String attribute = user.getAttribute("value");
		System.out.println(attribute);
		
		
		WebElement pass = l.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Bharathi@97");
		
		String string = pass.getAttribute(attribute);
		System.out.println(string);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
