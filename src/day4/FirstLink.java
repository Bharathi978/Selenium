package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLink {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
	
	WebDriver l = new ChromeDriver();
l.get("http://www.google.com/");	

WebElement type= l.findElement(By.xpath("//input[@class='gLFyf']"));
type.sendKeys("Greens Velmurugan");
WebElement clc = l.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
clc.click();
Thread.sleep(3000);
WebElement select = l.findElement(By.xpath("//h3[text()='Velmurugan K - Technical Manager - GTL Limited - LinkedIn']"));
select.click();





}}
