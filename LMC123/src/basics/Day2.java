package basics;

import org.openqa.selenium.By;
import java.lang.System;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	WebDriver driver;
	
	@Test(priority=0)
	public void setup() 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println("success");
	}
	
	@Test(priority=1,enabled=true)
	public void login() throws Exception
	{
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.findElement(By.id("email")).sendKeys("Skyworld1281@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9000172484");
		driver.findElement(By.id("u_0_2")).click();
		
	}
		@Test(priority=3 ,enabled=false)
		public void teardown()
		{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver.quit();
		}
		@Test(priority=2,enabled=true)
		public void logout() throws InterruptedException
		{
			Thread.sleep(3000);

			//System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver();
			WebElement element = driver.findElement(By.xpath("userNavigationLabel"));
			Actions action = new Actions(driver);
			action.moveToElement(element).click();
			//moveToElement(element1).click().build().perform();
			
			
			//Actions action = new Actions(driver);
			//WebElement element1 = driver.findElement(By.xpath("//span[@class='_54nh'])[9]"));
			//action.moveToElement(element).moveToElement(element1).click().build().perform();
		}
		
		
	

	

}
