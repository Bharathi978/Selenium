package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal13 {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
			
		n.get(" https://www.snapdeal.com/");
		
		Actions actt =new Actions(n);
		WebElement mobile = n.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		actt.moveToElement(mobile).perform();
		
		WebElement flip = n.findElement(By.xpath("//span[text()='Flip Covers']"));
		flip.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
