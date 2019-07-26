package Org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greentech {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\org.selenium.test\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement btnLogin= driver.findElement(By.xpath("//a[@href='contact.php']"));
	    btnLogin.click();
	    WebElement txtName= driver.findElement(By.xpath("//input[@id='inputname']"));
	    txtName.sendKeys("gowtham");
	    WebElement txtEmail= driver.findElement(By.xpath("//input[@id='email1']"));
	    txtEmail.sendKeys("shuttlergowtham25@gmail.com");
	    WebElement txtMobilenumber= driver.findElement(By.xpath("//input[@id='inputsubject']"));
	    txtMobilenumber.sendKeys("9715035130");
	    WebElement txtCourse= driver.findElement(By.xpath("//select[@name='courses']"));
	    txtCourse.sendKeys("selenium");
	    WebElement txtSelectthebranch= driver.findElement(By.xpath("//select[@name='branch']"));
	    txtSelectthebranch.sendKeys("Tambaram)");
	    WebElement txtPlanningToStartTiming= driver.findElement(By.xpath("//select[@name='time']"));
	    txtPlanningToStartTiming.sendKeys("7.00 am");
	    WebElement txtMessage= driver.findElement(By.xpath("//textarea[@class='form-control input-message']"));
	    txtMessage.sendKeys("available");
	    WebElement txtbtn= driver.findElement(By.xpath("//button[@type='submit']"));
	    txtbtn.click();

}

}