package org.webtable;

import java.sql.Driver;
import java.util.List;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Samplewebtable   {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bharathi\\eclipse-workspace\\selenium 2\\driver\\chromedriver.exe");
		WebDriver l = new EdgeDriver();
		l.get("https://www.w3schools.com/html/html_tables.asp");
		
	       WebElement table = l.findElement(By.xpath("//table[@id='customers']"));
				List<WebElement> alldate = table.findElements(By.tagName("tr"));			
				for (WebElement txt : alldate) {
					List<WebElement> alldatta = txt.findElements(By.tagName("td"));
					for (WebElement d : alldatta) {
						String text = d.getText();
						System.out.println(text);
					}
				}
			
	}}


	
		
//		
//		// 1.all datas get without heading
//		
//		l.get("https://www.w3schools.com/html/html_tables.asp");
//		WebElement table = l.findElement(By.xpath("//table[@id='customers']"));
//		List<WebElement> allRow = table.findElements(By.tagName("tr"));
//		
//		for (int i = 0; i <allRow.size(); i++) {
//			WebElement row = allRow.get(i);
//			List<WebElement> data = row.findElements(By.tagName("td"));
//		
//			for (int j = 0; j < data.size(); j++) {
//				WebElement datas = data.get(j);
//				System.out.println(datas.getText());
//			}
//		}
//	}
//}
		
		
		// 2.all datas get With heading 
//		l.get("https://www.w3schools.com/html/html_tables.asp");
//		WebElement table = l.findElement(By.xpath("//table[@id='customers']"));
//		List<WebElement> allRow = table.findElements(By.tagName("tr"));
//		WebElement heads = allRow.get(0);
//		List<WebElement> allheads = heads.findElements(By.tagName("th"));
//		for (int i = 0; i < allheads.size(); i++) {
//			WebElement headd = allheads.get(i);
//			System.out.println(headd.getText());
//		}
//		
//		for (int i = 0; i <allRow.size(); i++) {
//			WebElement row = allRow.get(i);
//			List<WebElement> data = row.findElements(By.tagName("td"));
//		
//			for (int j = 0; j < data.size(); j++) {
//				WebElement datas = data.get(j);
//				System.out.println(datas.getText());
//			}
//		}
		
		
		
		// 3.get the only heading print in console
		
//		l.get("https://www.w3schools.com/html/html_tables.asp");
//		WebElement table = l.findElement(By.xpath("//table[@id='customers']"));
//		List<WebElement> allRow = table.findElements(By.tagName("tr"));
//		WebElement row = allRow.get(0);
//		List<WebElement> heads = row.findElements(By.tagName("th"));
//		for (int i = 0; i < heads.size(); i++) {
//			WebElement heading = heads.get(i);
//			String text = heading.getText();
//			System.out.println(text);
//			
//		}
		
		
		//4.To Print last row and Last cell (data)
		
//		l.get("https://www.w3schools.com/html/html_tables.asp");
//		WebElement table = l.findElement(By.xpath("//table[@id='customers']"));
//		List<WebElement> allRow = table.findElements(By.tagName("tr"));
//		WebElement lastrow = allRow.get(allRow.size()-1);
//		List<WebElement> data = lastrow.findElements(By.tagName("td"));
//		WebElement lastdata = data.get(data.size()-1);
//		System.out.println(lastdata.getText());
//		
//		
//	}}
//		
     // 5.To Print middle row and middle (data)
		
//		l.get("https://www.w3schools.com/html/html_tables.asp");
//		WebElement table = l.findElement(By.xpath("//table[@id='customers']"));
//		List<WebElement> allRow = table.findElements(By.tagName("tr"));
//		WebElement midrow = allRow.get(allRow.size()/2);
//         List<WebElement> middata = midrow.findElements(By.tagName("td"));
//         WebElement data = middata.get(middata.size()/2);
//         System.out.println(data.getText());
//	}}
//		
		
		// 6.Get the all datas with heads but wihtout using loop 
		
//		l.get("https://www.w3schools.com/html/html_tables.asp");
//   	    WebElement table = l.findElement(By.xpath("//table[@id='customers']"));
//          System.out.println(table.getText());
//	}}
		
		
		
		// All data print by using foreach loop		
		
	
		
		
//for (WebElement dataa : alldate) {
//
//List<WebElement> allhead = dataa.findElements(By.tagName("th"));
//	for (WebElement heading : allhead) {
//		System.out.println(heading.getText());
//	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
//		WebElement btndate = l.findElement(By.xpath("//input[@id='onward_cal']"));
//		btndate.click();
// size count 
		//	List<WebElement> allrows = l.findElements(By.tagName("tr"));
			//System.out.println(allrows.get(2).getText());
			//System.out.println(allrows.size());
		
	
// Row print
//		
//		WebElement fifthrow = allrows.get(6);
//		
//		
//		List<WebElement> fifthrowdates = fifthrow.findElements(By.tagName("td"));
//		for (WebElement data : fifthrowdates) {
//			String tell = data.getText();
//			System.out.println(tell);
//			
			
			 
			
		
	
				
                
            
                
            

				
			
             
                
                
                
                
                
                
                
                
                
                
			
			
			
	
		
			
		
			
			
			
			
			
			
			
			
		
		
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	


