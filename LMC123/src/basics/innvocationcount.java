package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class innvocationcount {
	@Test(invocationCount=2,invocationTimeOut=20000)
	 public void setup() 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.gmail.com/");
		//driver.manage().window().maximize();
		driver.close();

}
}