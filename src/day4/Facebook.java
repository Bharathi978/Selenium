package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");

		WebDriver l = new EdgeDriver();


		l.get(" https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement email = l.findElement(By.id("email"));
		email.sendKeys("9789268944");



		String attribute = email.getAttribute("value");
		System.out.println(attribute);

		WebElement pass = l.findElement(By.id("pass"));
		pass.sendKeys("Bhar@thi234");

		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2);




	}}
