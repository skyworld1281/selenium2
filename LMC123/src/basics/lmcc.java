package basics;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.WrapsElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
//import org.apache.commons.collections4.FactoryUtils;
//import org.apache.commons.io.FileUtils;

public class lmcc {
	WebDriver driver;

	@Test(priority = 0)
	public void setup() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://45.33.46.234:8080/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//h2[text()='Ordering App']"))));
		element.click();

		System.out.println("success");
	}

	@Test(enabled = false)
	public void register() throws Exception {
		driver.findElement(By.xpath("//A[contains(text(),'Register')]")).click();
		File src = new File("C:\\Users\\ADMIN\\Desktop\\registration.xlsx");
		FileInputStream fls = new FileInputStream(src);
		System.out.println("sumanthsdlkjcfkslj");
		@SuppressWarnings("resource")
		XSSFWorkbook wb1 = new XSSFWorkbook(fls);
		XSSFSheet sheet1 = wb1.getSheet("Sheet3");

		String name = sheet1.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//INPUT[contains(@id, 'firstName')]")).sendKeys(name);

		String Email = sheet1.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.id("emailAddress")).sendKeys(Email);

		String phoneno = sheet1.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.id("phoneNo")).sendKeys(phoneno);

		String pwd = sheet1.getRow(3).getCell(0).getStringCellValue();
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
		String zipcode = sheet1.getRow(4).getCell(0).getStringCellValue();
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);

		driver.findElement(By.xpath("//*[@id='bt_signup']")).click();

		// driver.navigate().to("http://45.33.46.234:8080/food");
		// driver.findElement(By.xpath("http://45.33.46.234:8080/food")).equals(name);
		System.out.println("successfully registered");
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

		// WebDriverWait wait = new WebDriverWait(driver, 20);

		// WebElement element =
		// driver.findElement(By.xpath("(//div[@class='col-12'])[8]"));
		// wait.until(ExpectedConditions.elementToBeClickable(element)).click();

		// element.;
		System.out.println("yes success");
		// Actions a=new Actions(driver);
		// Thread.sleep(5000);
		/*
		 * WebElement
		 * op=driver.findElement(By.xpath("(//div[@class='col-12'])[8]"));
		 * Thread.sleep(1000); a.moveToElement(op).click();
		 * 
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ood = driver.findElement(By.xpath("(//div[@class='col-12'])[8]"));
		js.executeScript("arguments[0].click();", ood);

		Thread.sleep(1000);

		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath(“//div[contains(text(),’COMPOSE’)]”)));
	}

	@Test(priority = 1, enabled = true)
	public void custmor_login() throws Exception {

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		driver.findElement(By.id("login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("j_username")).sendKeys("Skyworld1281@gmail.com");
		driver.findElement(By.id("j_password")).sendKeys("9000172484");
		driver.findElement(By.id("login")).click();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("driver.findElement(By.id('searchbox')).sendKeys('L.
		// B. Nagar, Hyderabad, Telangana, India')");

		Actions a = new Actions(driver);
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.id("searchbox"));
		search.click();
		search.sendKeys("L. B. Nagar, Hyderabad, Telangana, India");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Actions an = new Actions(driver);
		Thread.sleep(3000);
		WebElement hotel = driver.findElement(By.xpath("//*[@id='storefound']/div[3]/div[1]/a/img"));
		an.moveToElement(hotel).build().perform();
		Thread.sleep(3000);
		hotel.click();
		Thread.sleep(2000);
		// add cart
		//Select drpdwn_date= new Select(driver.findElement(By.id("datedropdown-sku")));
		
		//drpdwn_date.selectByIndex(0);
		//date set
		driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
				Thread.sleep(5000);
				Robot dp = new Robot();
				dp.keyPress(KeyEvent.VK_DOWN);
				dp.keyRelease(KeyEvent.VK_DOWN);
				//dp.keyPress(KeyEvent.VK_DOWN);
				//dp.keyRelease(KeyEvent.VK_DOWN);
				dp.keyPress(KeyEvent.VK_ENTER);
				dp.keyRelease(KeyEvent.VK_ENTER);
		//addtocart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@class='btn btn-primary dropdown-toggle']")).click();
		/*//Thread.sleep(3000);
		Robot dp = new Robot();
		dp.keyPress(KeyEvent.VK_DOWN);
		dp.keyRelease(KeyEvent.VK_DOWN);
		dp.keyPress(KeyEvent.VK_DOWN);
		dp.keyRelease(KeyEvent.VK_DOWN);
		dp.keyPress(KeyEvent.VK_ENTER);
		dp.keyRelease(KeyEvent.VK_ENTER)*/;
		//driver.findElement(By.xpath("//*[@id='skuitem-main']/div/div[2]/div[2]/div/div/a")).click();
		System.out.println("good");
		Thread.sleep(5000);
		// add to oder
		driver.findElement(By.xpath("//*[@id='mCSB_1_container']/div[2]/div[1]/button")).click(); // *[@id="cart-btn"]
		Thread.sleep(2000);
System.out.println("added to cart");
		// click on cart
		Actions cart = new Actions(driver);
		WebElement cart1 = driver.findElement(By.xpath("//*[@id='cart-btn']"));
		cart.moveToElement(cart1).build().perform();
		cart1.click();
		Thread.sleep(2000);
		// Actions aa = new Actions(driver);
		WebElement checkout = driver.findElement(By.xpath("//*[@id='cart-checkoutbtn']"));//// *[@id="cart-checkoutbtn"]
		cart.moveToElement(checkout).build().perform();
		checkout.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='addressLine1']")).sendKeys("l.b.nagar");
		driver.findElement(By.xpath("//*[@id='addressNext']")).click();
		Thread.sleep(1000);

		Actions DELTIM = new Actions(driver);
		Thread.sleep(2000);
		WebElement DELTIM_BTN = driver.findElement(By.xpath("(//*[contains(@class ,'lslide')])[5]"));
		                                                                                                 
		DELTIM.moveToElement(DELTIM_BTN).build().perform();
		DELTIM_BTN.click();
		driver.findElement(By.xpath("//*[contains(@onclick,'saveCartDeliveryTime();')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[contains(@id,'completeOrder')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='completeOrder']")).click();
		Thread.sleep(2000);
		// PAYMENT CARD DETAILS
		driver.findElement(By
				.xpath("//*[@id='payment-area']/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/div/ul/li[2]/a"))
				.click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("4242424242424242");////DIV[contains(@id, "payment-area")]
		//Actions as=new Actions(driver);
		//WebElement card=driver.findElement(By.xpath("//input[@name='account_number']"));
		//as.moveToElement(card).build().perform();	
		//card.sendKeys("4242424242424242");
		driver.findElement(By.xpath("//*[@name='expiry_month']")).sendKeys("01");
		driver.findElement(By.xpath("//*[@name='expiry_year']")).sendKeys("20");
		driver.findElement(By.xpath("//*[@name='security_code']")).sendKeys("100");
		driver.findElement(By.xpath("//*[@class='btn-green btn--stateful width-100]")).click();

		// JUSPAY-PASSWORD
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("1221");
		driver.findElement(By.xpath("//*[@id='cmdSubmit']")).click();
		// method to checkout
		/*
		 * Actions aa = new Actions(driver); WebElement checkout =
		 * driver.findElement(By.xpath("//*[@id='cart-checkoutbtn']"));
		 * cart.moveToElement(checkout).build().perform(); checkout.click();
		 * Thread.sleep(2000); File f1 = ((TakesScreenshot)
		 * driver).getScreenshotAs(OutputType.FILE); Files.copy(f1, new
		 * File("C:\\Users\\ADMIN\\Desktop\\lmc.png"));
		 */

		/*
		 * Actions myorder = new Actions(driver); WebElement Sumanth =
		 * driver.findElement(By.xpath("//*[@id='menuProfile']/a"));
		 * myorder.moveToElement(Sumanth).build().perform(); Select s = new
		 * Select(Sumanth); s.selectByIndex(1);
		 */

	}

	/*
	 * @Test(priority=2,enabled=false,alwaysRun=false) public void logout()
	 * throws Exception
	 * 
	 * { Actions a=new Actions(driver); //WebElement
	 * drplogout=driver.findElement(By.xpath("//A[contains(text(),'sumanth ')]")
	 * ); //WebElement
	 * drplogout=driver.findElement(By.xpath("(//div[@class='col-12'])[8]"));
	 * 
	 * drplogout.findElement(By.xpath(
	 * "//*[@id='menuProfile']/div/div/ul/li[4]/a")).click();
	 * 
	 * 
	 * driver.findElement(By.xpath("//*[@id='cartItemTotalText']")).click(); }
	 */

}
