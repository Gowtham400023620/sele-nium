package Org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\org.selenium.test\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement Dom= driver.findElement(By.id("month"));
		Select s= new Select(Dom);
		s.selectByIndex(10);
		
		WebElement Dom1= driver.findElement(By.id("month"));
		Select s1= new Select(Dom1);
		List<WebElement> emp= s.getOptions();
		for (int i=0; i<empsize();i++);{
			WebElement w= emp.get(i);
			system.out.println(w.getText());
		}
		
		
		
		
		
	
	}	
}
