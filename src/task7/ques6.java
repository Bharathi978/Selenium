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

public class ques6 {

	public static void main(String[] args) throws IOException {
		
System.setProperty("webdriver. chrome. driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver j = new ChromeDriver();
		
		
		j.get("http://greenstech.in/selenium-course-content.html");
		
		JavascriptExecutor km = (JavascriptExecutor)j;
		
		WebElement top = j.findElement(By.xpath("(//h3[@class='mb-0'])[12]"));
		
		km.executeScript("arguments[0].scrollIntoView(true)", top);
		
		
		
		 TakesScreenshot th =  (TakesScreenshot)j;
			
			File as = th.getScreenshotAs(OutputType.FILE);
			System.out.println(as);
			
			File att = new File("C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\screenshot\\bharathi6.png");
			
			FileUtils.copyFile(as, att);
			
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
