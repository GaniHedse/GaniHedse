package java_programs;

public class StringFunction {

	public static void main(String[] args) {

		String s = "Manas";
		String s1 = " Manas Qa Manas Dev 123 ";
		String s2 = "Tuwani";

		System.out.println(s.length());

		System.out.println(s.startsWith("Mani"));
		System.out.println(s.endsWith("z"));

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));

		System.out.println(s1.contains("QA"));
		System.out.println(s1.isEmpty());

		// WAP to check string s is starts with 'M' and length is greater than 5

		if (s.startsWith("M") && s.length() > 5) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}
		
		System.out.println(s.concat(" QA"));
		
		System.out.println(s2.charAt(1));
		System.out.println(s2.indexOf("a"));

		System.out.println(s1);
		System.out.println(s1.trim());
		
		System.out.println(s1.replace("Manas Dev", "Java"));
		
	}

}
