package dataDrivenFw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInNotepad {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\DataOutput.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Welcome to Automation Testing World !");		
		bw.newLine();
		
		bw.write("Selenium Java");
		bw.close();

	}

}
