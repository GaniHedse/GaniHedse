package java_programs;

public class MethodReturnType {
	
	public static int m1() {
		int a =110;
		int b= 120;
		int c= a+b;
		
		return c;
	}
	
	public String m2() {
		String a = "Manas";
		int i =20;
		return a;
	}
	
	public String concatStr(String s1, String s2) {
		return s1+s2;
	}
	
	public static boolean m4() {
		String s1 = "Manas QA";
		return s1.contains("QA1");
	}

	public static void main(String[] args) {
		
		System.out.println(m1());
		
		MethodReturnType obj = new MethodReturnType();	
		System.out.println(obj.m2());
		
		System.out.println(obj.concatStr("Manas ", "QA"));
		System.out.println(m4());
		
		
	}

}
