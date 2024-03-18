package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
			
		n.get(" https://www.snapdeal.com/");
		
		Actions actt =new Actions(n);
		
		WebElement women = n.findElement(By.xpath("(//span[@class='catText'])[2]"));
		actt.moveToElement(women).perform();
		
		WebElement foot = n.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
		foot.click();
		
		WebElement heel = n.findElement(By.xpath("//div[text()='Heels for Women']"));
		heel.click();

		
		
	}
	
	
	
	
	
	
	
	
	
}
