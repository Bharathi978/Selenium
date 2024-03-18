package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flip {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
		
		n.get("https://www.flipkart.com/");
		

		WebElement but = n.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		but.click();
		
		
		Actions add = new Actions(n);
		WebElement home = n.findElement(By.xpath("(//img[@class='_396cs4'])[5]"));
		add.moveToElement(home).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
