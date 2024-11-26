package dataDrivenFw;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class PrinitingColumn {

	public static void main(String[] args) throws Exception, Exception {

		FileInputStream f = new FileInputStream(
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\DataSheet.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");

		// Identifying the cell and printing the data (c,r)
		
		int rc =s.getRows();
		int cc =  s.getColumns();
		
		for(int i=0; i<cc; i++) {
			System.out.print(s.getCell(i, 0).getContents()+" ");
		}
	}
	

}
