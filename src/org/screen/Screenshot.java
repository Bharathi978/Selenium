package org.screen;

import java.io.File; 
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver. chrome. driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver j = new ChromeDriver();
		
		j.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//Screenshot.sam(j);
		
		
	    
		
		
		WebElement email = j.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("sharathibharathi@gmail.com");
		Screenshot.sam(j);
		 
		
		
		WebElement pass = j.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("9789268945");
		//Screenshot.sam(j);
		
		
		
	}
	
	
	
	public static void sam(WebDriver j ) throws IOException {
		TakesScreenshot tk =  (TakesScreenshot)j;
		
		
	    // Take the screenshot and store it in default location
		File src = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		
		// Create a new file
		File desc = new File("C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\screenshot\\commons-io-2.11.0.jar\\"+System.currentTimeMillis()+"nap.png");
		
		//copy From src to desc
		FileUtils.copyFile(src, desc);
	}
	
	
	
	
}
