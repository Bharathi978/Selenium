package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedepot {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
		
		n.get("https://www.homedepot.com/");
		
		Actions actt =new Actions(n);
		WebElement all = n.findElement(By.xpath("//a[text()='All Departments']"));
		actt.moveToElement(all).perform();
		
		WebElement heating = n.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		actt.moveToElement(heating).perform();
		
		WebElement air = n.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		actt.moveToElement(air).perform();
		
		Thread.sleep(2000);
		WebElement port = n.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		port.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
