package Org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\org.selenium.test\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtusername= driver.findElement(By.id("email"));
		txtusername.sendKeys("hello");
		WebElement txtpassword= driver.findElement(By.id("pass"));
		txtpassword.sendKeys("pass");
		WebElement btnLogin= driver.findElement(By.xpath("//input[@value='2']"));
	    btnLogin.click();
		driver.quit();
}
}
