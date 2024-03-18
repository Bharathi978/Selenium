package task7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques2tools {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver. chrome. driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver j = new ChromeDriver();
		
		j.get(" http://toolsqa.com/");
		
		j.manage().window().maximize();
		
		JavascriptExecutor km = (JavascriptExecutor)j;
		
		Thread.sleep(2000);
		
		WebElement down = j.findElement(By.xpath("(//div[@class='links-heading text-uppercase text-white'])[3]"));
		km.executeScript("arguments[0].scrollIntoView(true)", down);
		
		j.manage().window().minimize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
