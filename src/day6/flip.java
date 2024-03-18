package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flip {
	public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
			
		k.get("https://www.flipkart.com/");
		
		k.manage().window().maximize();
		
     k.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		WebElement but = k.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		but.click();
		
		Actions actt = new Actions(k);
		WebElement camera = k.findElement(By.xpath("(//div[@class='_3LU4EM'])[1]"));
		actt.contextClick(camera).perform();
	
		
		Robot r = new Robot();
		
		for (int i = 0; i < 4; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
