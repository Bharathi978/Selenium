package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		l.get("https://www.amazon.in/");
		
		//drop down search
		WebElement dpdsearch = l.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dpdsearch);
		
		s.selectByVisibleText("Books");
		
		Thread.sleep(3000);
		s.selectByValue("search-alias=home-improvement");
		
		Thread.sleep(3000);
		s.selectByIndex(4);
		
		// fetch all option
		
		List<WebElement> alloptions = s.getOptions();
		int optioncount = alloptions.size();
		System.out.println(optioncount);
		
//		// To select last option
//     	s.selectByIndex(optioncount-1);
//		
//     	// print in  text
//     	
//		for (WebElement option : alloptions) {
//		
//			String text = option.getText();
//			System.out.println(text);}	
//						
//						
//		System.out.println("print All Attribute Value");
//						
//		
//		for (WebElement option : alloptions) {
//			String attribute = option.getAttribute("value");
//			System.out.println(attribute);}
//		
		
		
//		
//		
//		
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
	}
}
