package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	
	public static void main(String[] args) throws AWTException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		
		
		k.get("https://www.amazon.in/");
		WebElement sign = k.findElement(By.xpath("//span[text()='Hello, sign in']"));
		sign.click();
		
         WebElement email = k.findElement(By.xpath("//input[@type='email']"));
         email.sendKeys("bharatgy");
		
		Actions actt= new Actions(k);
		actt.doubleClick(email).perform();
		
		actt.contextClick(email).perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i < 5; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	
	
	
	
	
	
	
	
	

}
