package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
			
		k.get(" https://www.amazon.in/");
		
		Actions actt =new Actions(k);
		
		
		WebElement sign = k.findElement(By.xpath("//span[text()='Hello, sign in']"));
		actt.moveToElement(sign).perform();
		
		WebElement sts = k.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		sts.click();
		WebElement name = k.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("bharathi");
		
		WebElement phone = k.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys("9789268943");

		WebElement mail = k.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("sarathibharathi@gmal.com");
		
		WebElement pass = k.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Bharath@76");
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
