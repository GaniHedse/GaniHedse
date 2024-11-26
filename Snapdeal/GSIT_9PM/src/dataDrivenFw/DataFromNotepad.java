package dataDrivenFw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataFromNotepad {

	public static void main(String[] args) throws Exception {
		
		// Creating File Reader object to identify notepad
		FileReader f = new FileReader("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\Data.txt");
	
		BufferedReader b = new BufferedReader(f);
		
		String s;
		while((s=b.readLine())!=null) {
			System.out.println(s);
		}
	
	}

}
