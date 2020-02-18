package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFile {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("/Users/apollozealot/Documents/AutoRepo/AutoRepo/AutoRepo/src/FileHandling/test.xlsx");
		
XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		FileOutputStream file2 = new FileOutputStream("/Users/apollozealot/Documents/AutoRepo/AutoRepo/AutoRepo/src/FileHandling/TestData.xlsx");

		cell.setCellValue("Gaurav");
		
		wb.write(file2);
		
		String abc = cell.getStringCellValue();
		
		System.out.println(abc);
		
		
	}

}
