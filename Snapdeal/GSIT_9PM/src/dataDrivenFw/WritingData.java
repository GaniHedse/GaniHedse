package dataDrivenFw;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WritingData {

	public static void main(String[] args) throws Exception {
		
       //Importing FileOutputStream class
		FileOutputStream f = new FileOutputStream("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\OutputSheet.xls");
		
		//Creating the Workbook
		WritableWorkbook wb = Workbook.createWorkbook(f);
		
		WritableSheet ws = wb.createSheet("Result", 1);
		
		int a =10;
		int b= 20;
		int c= a*b;
		
		//Creating the cell using label class
		Label l = new Label(0, 0, "C value is: "+c);
		
		ws.addCell(l);
		
		//Saving and closing
		wb.write();
		wb.close();
	}

}
