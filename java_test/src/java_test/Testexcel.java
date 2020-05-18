package java_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testexcel {
	 public static void main(String args[])
	 {
	
	File f= new File ("E:\\softwares\\eclipse\\java_test\\src\\New Microsoft Excel Worksheet.xlsx");
	
	try {
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb= WorkbookFactory.create(fis);
		
		//Sheet st =wb.getSheet();
		Sheet st = wb.getSheetAt(0);
		Row row = st.getRow(1);
		Integer rowcount1 = st.getLastRowNum();
		Integer rowcount2 = st.getPhysicalNumberOfRows();
		Cell c = row.getCell(1);
		System.out.println(c.toString());
		System.out.println(rowcount1);
		System.out.println(rowcount2);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (EncryptedDocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 }
}
