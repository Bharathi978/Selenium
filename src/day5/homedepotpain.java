package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homedepotpain {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
		
		n.get("https://www.homedepot.com/");
		
		Actions actt =new Actions(n);
		WebElement all = n.findElement(By.xpath("//a[text()='All Departments']"));
		actt.moveToElement(all).perform();
		
		
		
		WebElement pain = n.findElement(By.xpath("(//a[text()='Paint'])[1]" ));
		actt.moveToElement(pain).perform();
		
		WebElement intt = n.findElement(By.xpath("//a[text()='Interior Paint']"));
		actt.moveToElement(intt).perform();
		
		WebElement cell = n.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		cell.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
