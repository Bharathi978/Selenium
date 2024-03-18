package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		
		k.get(" http://output.jsbin.com/osebed/2");
		
		
		WebElement dpdsearch = k.findElement(By.id("fruits"));
		
		Select s = new Select(dpdsearch);
		s.selectByIndex(1);
		s.selectByIndex(3);
		s.selectByValue("orange");
		s.selectByVisibleText("Banana");
		
//Check selection option multiple value
	//	boolean b = s.isMultiple();
		//System.out.println(b);
		
		
		
		
//	selection option print
	List<WebElement> all = s.getAllSelectedOptions();
		//for (WebElement hlo : all) {
			//System.out.println(hlo.getText());}
	
	
	
		
// first selection option
//		WebElement p = s.getFirstSelectedOption();
//		System.out.println(p.getText());
		
		
		
 //selection all option		
		List<WebElement> hs = s.getOptions();
		for (int i = 0; i < hs.size(); i++) {
			s.selectByIndex(i);
			}
		
		
		
		
		
		
		
		
	}}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

