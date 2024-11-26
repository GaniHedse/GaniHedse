package java_programs;

public class ReversString {

	public static void main(String[] args) {

		String s = "Manas QA"; // AQ sanaM

		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
