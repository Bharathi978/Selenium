package org.scrollupdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		l.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
// url launch		
		l.get("http://greenstech.in/selenium-course-content.html");
		
		
// scroll up or down syntax
		
		JavascriptExecutor jk = (JavascriptExecutor)l;
		
// down condition
		
		WebElement down = l.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", down);	


//Thread.sleep(3000);
		
// up condition 

		WebElement up = l.findElement(By.xpath("//h2[text()='Upcoming Batches - Manual and Automation Testing LIVE Schedule:']"));
		jk.executeScript("arguments[0].scrollIntoView(false)", up);
		
	}
	
	
	

	
	
	
	
	
	
	
	
}
