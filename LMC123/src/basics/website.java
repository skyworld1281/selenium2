package basics;
import java.io.File;
import java.io.FileInputStream;
//import java.sql.Driver;

//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class website { 
	
	@Test
	public void StepFile() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("file:///C:/Users/ADMIN/Desktop/Form.htm");
	
	File src= new File("C:\\Users\\ADMIN\\Desktop\\sample.xlsx");	
	FileInputStream fls= new FileInputStream(src);
	System.out.println("sumanthsdlkjcfkslj");
	@SuppressWarnings("resource")
	XSSFWorkbook wb1=new XSSFWorkbook(fls);
	XSSFSheet sheet1=wb1.getSheet("Sheet1");
	for(int i=1;i<=sheet1.getLastRowNum()+1;i++)
	{
		
		
			String  username = sheet1.getRow(i).getCell(0).getStringCellValue();
			String  pwd = sheet1.getRow(i).getCell(1).getStringCellValue();
			
			// cell.setCellType(cell.CELL_TYPE_STRING);
			 driver.findElement(By.name("fname")).clear();
			 driver.findElement(By.name("fname")).sendKeys(username);
			 driver.findElement(By.name("lname")).clear();          
			 driver.findElement(By.name("lname")).sendKeys(pwd);
			 
			// driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	  }
	
	driver.quit();
	 }
	 }
	 
	
	






