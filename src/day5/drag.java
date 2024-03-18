package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		
		l.get(" http://demo.guru99.com/test/drag_drop.html ");
		
		WebElement bank = l.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement loct = l.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act =new Actions(l);
		act.dragAndDrop(bank, loct).perform();

//		WebElement am = l.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//		WebElement acct = l.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		act.dragAndDrop(am, acct).perform();
//		
//		
//		WebElement sale = l.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
//		WebElement lo = l.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		act.dragAndDrop(sale, lo).perform();
//		
//
//		WebElement sales = l.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//		WebElement lot = l.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//		
//		act.dragAndDrop(sales, lot).perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
