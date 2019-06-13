package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel
	{
	public WebDriver driver;
	@Test	
	public void setup() 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.quit();
		}
	@Test	
	public void setup1() throws Exception 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.navigate().to("https://www.gmail.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
		}
	}