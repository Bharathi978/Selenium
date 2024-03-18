package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipcart {
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
			
		k.get("https://www.flipkart.com/");
		
		

		WebElement but = k.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		but.click();
		
		WebElement appl = k.findElement(By.xpath("//div[text()='Appliances']"));
		appl.click();
		
		Actions actt = new Actions(k);
		Thread.sleep(3000);
		WebElement aplled = k.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		actt.moveToElement(aplled).perform();
		
		WebElement west = k.findElement(By.linkText("Mi"));
		west.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
