package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopcloue {
	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		
		l.get(" https://www.shopclues.com/wholesale.html ");
		
	
		WebElement mob = l.findElement(By.xpath("(//li[@class='child-one'])[3]"));
		mob.click();
		Thread.sleep(2000);
		WebElement slt = l.findElement(By.xpath("(//span[@class='prod_name '])[2]"));
		slt.click();
		
		
		
		
		
	}
	
	
	

}
