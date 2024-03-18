package task7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ques4 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver. chrome. driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver j = new ChromeDriver();
		
    j.get("http://www.greenstechnologys.com/");
		Thread.sleep(3000);
		
		WebElement button = j.findElement(By.xpath("//button[@type='button']"));
		button.click();
  
		JavascriptExecutor km = (JavascriptExecutor)j;
		
		WebElement scroll = j.findElement(By.xpath("(//span[@class='red_text'])[6]"));
		
		km.executeScript("arguments[0].scrollIntoView(true)", scroll);
		Thread.sleep(3000);
		TakesScreenshot th =  (TakesScreenshot)j;
		
		File as = th.getScreenshotAs(OutputType.FILE);
		System.out.println(as);
		
		File att = new File("C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\screenshot\\commons-io-2.11.0.jar\\bharathi.png");
		
		FileUtils.copyFile(as, att);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
