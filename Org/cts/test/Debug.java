package Org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\org.selenium.test\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		WebElement txtEmail= driver.findElement(By.id("identifierId"));
		txtEmail.sendKeys("gowtham");
		
		WebElement btnnext= driver.findElement(By.xpath("//span[text()='Next']"));
		btnnext.click();
		
		Thread.sleep(200);
		WebElement txtpass= driver.findElement(By.name("password"));
		txtpass.sendKeys("345678");
		
		WebElement btnnext1= driver.findElement(By.xpath("//span[text()='Next1']"));
		btnnext1.click();
		
		driver.quit();
	
	}	
		
}
