package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class shopclue {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver n = new ChromeDriver();
		
		n.get(" https://www.shopclues.com/wholesale.html");
		
		
		Actions actt =new Actions(n);
		WebElement mob = n.findElement(By.xpath("//a[text()='Mobiles & More']"));
		actt.moveToElement(mob).perform();
		
		WebElement sam = n.findElement(By.xpath("(//a[text()='Micromax'])[1]"));
		sam.click();		
	
		
		
		
		
		Thread.sleep(2000);
		
		String windowHandle = n.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> windowHandles = n.getWindowHandles();
		System.out.println(windowHandles);
		for (String x : windowHandles) {
			if (!windowHandle.equals(x)) {
				n.switchTo().window(x);
			}}
		
		
		Thread.sleep(2000);
		WebElement prze = n.findElement(By.xpath("//label[@for='Rs. 5000 - Rs. 6999']"));
		prze.click();
		
		
		
		
		
		
		
		
	}	
	}
	
	
	
	
	
	
	
	
	

