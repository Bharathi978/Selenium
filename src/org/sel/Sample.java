package org.sel;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Sample {
	
	public static  void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver u = new ChromeDriver();
		
		u.get("https://www.facebook.com/");
		
		
		WebElement texname = u.findElement(By.id("email"));
		
		
		texname.sendKeys("Green OMR");
		
		
		WebElement texpassword = u.findElement(By.id("pass"));
		
		
		
		texpassword.sendKeys("23456@sdfgh");
		
		
		
	}
	
	
	

}
