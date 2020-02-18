package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException,FileNotFoundException {

		FileInputStream file = new FileInputStream("/Users/apollozealot/Documents/AutoRepo/AutoRepo/AutoRepo/src/FileHandling/test.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
;		
		// Returns XSSFSheet as object
		
	String data = cell.getStringCellValue();
	
	
	//System.out.println(data);
		
		wb.close();
		
		String data1=sheet.getRow(0).getCell(0).getStringCellValue();
		
		//System.out.println(data1);
		
		int rows=sheet.getLastRowNum();
		
		int cols = sheet.getRow(0).getLastCellNum();
		
		//System.out.println(rows);
		//System.out.println(cols);
		
		for (int r=0; r<=rows;r++)
			
		{
			for (int c=0; c<cols; c++) 
			{
				System.out.print(sheet.getRow(r).getCell(c).getStringCellValue());
			}
			
			System.out.println();
		}
		
		
				
	}

}
