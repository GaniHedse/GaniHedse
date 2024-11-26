package java_program;

public class ReverseString {

	public static void main(String[] args) {
		
		String a = "Manas QA"; //sanaM
		
		for(int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}

	}

}
