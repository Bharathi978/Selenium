package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
		
		
		n.get("http://greenstech.in/selenium-course-content.html");
		

		Actions actt =new Actions(n);
		
		WebElement course = n.findElement(By.xpath("//div[@class='header-browse-greens']"));
		actt.moveToElement(course).perform();
		
		WebElement soft = n.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		actt.moveToElement(soft).perform();
		
		WebElement sele = n.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		sele.click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
