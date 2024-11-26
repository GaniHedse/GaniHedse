package java_program;

public class StringValidation {

	public static void main(String[] args) {
		
		String s = "Manas QA";
		String s2 ="Manas qa";
		
	
		System.out.println(s.length());
		System.out.println(s.startsWith("M"));
		System.out.println(s.endsWith("QA"));
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s.contains("Manas"));
		
		System.out.println(s.isEmpty());
		
		//WAP to verify String s is not containing "QA1" and length of s is greater than 5
		
		if(s.contains("QA1")==false && s.length()>5) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
