package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class google {
public static void main(String[] args) throws AWTException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	WebDriver k = new ChromeDriver();
	
	k.get(" https://www.google.co.in/webhp ");
	
	
	WebElement enter = k.findElement(By.xpath("//input[@class='gLFyf']"));
	enter.sendKeys("velmurugan");
	
	Actions actt= new Actions(k);
	actt.doubleClick(enter).perform();
	
	Robot r = new Robot();
	
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
