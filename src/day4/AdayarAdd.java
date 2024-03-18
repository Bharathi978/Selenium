package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdayarAdd {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		
		
		l.get(" http://greenstech.in/selenium-course-content.html");
		
		JavascriptExecutor  jk = (JavascriptExecutor)l;
		Thread.sleep(3000);
		WebElement add = l.findElement(By.xpath("(//div[@class='col-md-3 short-desc-with-logo widget widget_text'])[1]"));
		jk.executeScript("arguments[0].scrollIntoView(true)", add);
		
		String text = add.getText();
		System.out.println(text);
		
	
		
		
}
}