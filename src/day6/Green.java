package day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Green {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get(" http://greenstech.in/selenium-course-content.html");
		
		
		WebElement interview = k.findElement(By.xpath("//div[@id='heading20']"));
		interview.click();
		
		Actions actt = new Actions(k);
		
		
		WebElement ctc = k.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		actt.contextClick(ctc).perform();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
