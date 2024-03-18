package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class green2 {
public static void main(String[] args) throws AWTException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	WebDriver k = new ChromeDriver();
	k.get(" http://greenstech.in/selenium-course-content.html");
	
	
	Actions actt = new Actions(k);
	
	WebElement frame = k.findElement(By.xpath("//div[@id='heading304']"));
	actt.contextClick(frame).perform();
	
	Robot r = new Robot();
	
	
	for (int i = 0; i < 10; i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
	}
	
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
