package genric_Lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_lib {


	public static String readingdata(String Sheet1, int rowno, int col) { 
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("C:\\Users\\ROHITH\\eclipse-workspace\\Elf4445\\src\\test\\resources\\Excel_Lib\\testdata.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		
		}
		
	
	return workbook.getSheet("Sheet1").getRow(rowno).getCell(col).toString();
	
	}

}

