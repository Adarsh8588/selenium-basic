package genericUtility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelUtility {

	public static void main(String[] args) throws Exception
	{
	 FileInputStream fis = new  FileInputStream ("./src/test/resources/Book.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet("Sheet1");
	      WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
	      driver.get(sh.getRow(1).getCell(0).toString());
	      driver.get(sh.getRow(1).getCell(1).toString());
	      
//	      Row row = sh.getRow(0);
//	      Cell cell = row.getCell(1);
//	      cell.getStringCellValue();
//	      wb.close();
	      
	}

}
