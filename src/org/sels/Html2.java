package org.sels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html2 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	
	
	WebDriver k = new ChromeDriver();
	
	k.get(" http://demo.automationtesting.in/Register.html\r\n" + 
			"");
		
		
		WebElement txt1stname = k.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required'])[1]"));
		txt1stname.sendKeys("bharathi");
	
		
	WebElement last = k.findElement(By.xpath("//input[@placeholder='Last Name']"));
	last.sendKeys("sharthi");
	
	WebElement add = k.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	add.sendKeys("34 spk street ");
	
	WebElement email = k.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("sharathibharathi@gmail.com");
	
	WebElement phone = k.findElement(By.xpath("//input[@type='tel']"));
	phone.sendKeys("9789268944");
	
	WebElement male = k.findElement(By.xpath("(//input[@type='radio'])[1]"));
	male.click();
	
	WebElement hoby = k.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	hoby.click();
	
	WebElement clk = k.findElement(By.xpath("//div[@id='msdd']"));
	clk.click();
	
	WebElement lang = k.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
	lang.click();
	
	WebElement java = k.findElement(By.xpath("//option[@value='Java']"));
	java.click();
	
	WebElement nation = k.findElement(By.xpath("//option[@value='India']"));
	nation.click();
	
	WebElement dob = k.findElement(By.xpath("//option[@value='1993']"));
	dob.click();
	
	WebElement month = k.findElement(By.xpath("//option[@value='July']"));
	month.click();
	
	WebElement date = k.findElement(By.xpath("//option[@value='23']"));
	date.click();
	
	WebElement pass = k.findElement(By.xpath("//input[@ng-model='Password']"));
	pass.sendKeys("bharathi@45");
	
	WebElement cpass = k.findElement(By.xpath("//input[@ng-model='CPassword']"));
	cpass.sendKeys("bharathi@45");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}}
