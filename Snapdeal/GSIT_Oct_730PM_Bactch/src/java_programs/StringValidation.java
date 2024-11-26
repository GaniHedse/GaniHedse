package java_programs;

public class StringValidation {

	public static void main(String[] args) {
		
		String s1 = "Manas QA";
		String s2 = "manas Qa";
		String s3 = "";
		
		System.out.println(s1.length());
		System.out.println(s1.startsWith("Man"));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s3.isEmpty());
		
		System.out.println(s1.contains(" "));
		
		
		//WAP to verify string s1 is starting with M and its containing QA
		
		if(s1.startsWith("M")== true && s1.contains("QA")==true) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//WAP to verify string s1 is starting with M and its Length is greater than 5
		
		if(s1.startsWith("M")== true && s1.length() >5) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
