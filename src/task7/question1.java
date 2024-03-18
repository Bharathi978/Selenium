package task7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question1 {

	
	public static void main(String[] args) throws IOException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
			
k.get(" http://www.greenstechnologys.com/");
		
		TakesScreenshot tk =  (TakesScreenshot)k;
		File as = tk.getScreenshotAs(OutputType.FILE);
		
		System.out.println(as);
		
		File art = new File("C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\screenshot\\commons-io-2.11.0.jar\\Firs.png");
		
		FileUtils.copyFile(as, art);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
