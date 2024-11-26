package java_programs;

public class MethodRT {
	
	public static int m1() {
		int a =20; int b=30;
		int c =a+b;
		return c;	
	}
	
	public int m2() {
		int a =20; int b=30;
		int c =a+b;
		return c;	
	}
	
	public static String m3() {
		String c = "Manas";
		return c;
	}
	
	public static boolean m4() {
		String s = "GSIT";
		return s.contains("IT");
	}
	
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static String m5(String fn, String ln) {
		return fn.concat(ln);
	}

	public static void main(String[] args) {
		
          System.out.println(m1());
          
          MethodRT obj = new MethodRT();
          
          System.out.println(obj.m2());
          
          System.out.println(m3());
          
          System.out.println(m4());
          
          System.out.println(obj.add(20, 40));
          
          System.out.println(m5("Manas ", "QA"));
          
	}

}
