package dataDrivenFw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class PrintingTable {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream(
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\sheet.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		int cc = s.getColumns();
		int rc = s.getRows();
		
		for(int i=0; i<rc; i++) {
			for(int j=0; j<cc; j++) {
				System.out.print(s.getCell(j,i).getContents()+"  ");
			}
			System.out.println();
		}

	}

}
