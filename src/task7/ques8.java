package task7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques8 {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver. chrome. driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver j = new ChromeDriver();
		
		
		j.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor km = (JavascriptExecutor)j;
		WebElement corejava = j.findElement(By.xpath("//div[@id='heading302']"));
		km.executeScript("arguments[0].scrollIntoView(true)", corejava);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
