package java_program;

public class MethodRT {
	
	public static int m1() {
		int a =20;
		int b =30;
		
		int c= a+b;
		return c;
	}
	
	public static String m2() {
	
	String a = "Manas";
	String b = "QA";
	int c = 30;
	
	return a.concat(b);
	}
	
	public boolean m3() {
		String a = "Manas";
		return a.startsWith("M");
	}
	
	public int m4(int x, int y) {
		int z = x+y;
		return z;
	}

	public static void main(String[] args) {
		
		System.out.println(m1());
        System.out.println(m2());
        
        MethodRT m = new MethodRT();
        
        System.out.println(m.m3());
        
        System.out.println(m.m4(80, 20));
	}

}
