package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopclove {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	WebDriver n = new ChromeDriver();
	
	n.get(" https://www.shopclues.com/wholesale.html");
	
	
	Actions actt =new Actions(n);
	
WebElement sport = n.findElement(By.xpath("//a[text()='Sports & More']"));

	actt.moveToElement(sport).perform();
	
	
	WebElement weight = n.findElement(By.xpath("//a[text()='Weight Gainers']"));
	weight.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
