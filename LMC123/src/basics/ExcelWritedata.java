package basics;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWritedata {
	@Test
	public void WriteData() throws Exception
	{
		
		File src=new File("C:\\Users\\ADMIN\\Desktop\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet Sheet=wb.getSheetAt(2);
		System.out.println("okkkkkkk");
		XSSFCell cell=Sheet.getRow(1).createCell(1);
				cell.setCellValue("sumanth");
		//System.out.println("the value ie"+Sheet.getRow(1).getCell(0).getStringCellValue());
		FileOutputStream dd=new FileOutputStream(src);
		//wb.sav(dd);
		wb.close();
		//dd.close();

		
	
	/*Row row = Sheet.createRow(1);
		 Cell cell = row.createCell(1);

		cell.setCellType(cell.CELL_TYPE_STRING);
		 cell.setCellValue("SoftwareTestingMaterial.com");
		 FileOutputStream fos = new FileOutputStream(src);
		 wb.write(fos);
		 fos.close();
	*/
	
	
	
	}

}
