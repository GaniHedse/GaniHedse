package dataDrivenFw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class ReadingData {

	public static void main(String[] args) throws Exception {
		
		//Importing Fileinput Stream class to findout the location of Excel	
		FileInputStream f = new FileInputStream("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\DataSheet.xls");
	
		//Opening the ExcelSheet 
		Workbook wb = Workbook.getWorkbook(f);
		
		//Opening the Sheet
		Sheet s = wb.getSheet("Sheet1");
		
		//Identifying the cell and printing the data (c,r)
		
		System.out.println(s.getCell(10, 10).getContents());
		
	
	
	}

}
