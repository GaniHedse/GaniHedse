package java_programs;

public class Method {
	
	public static void m1() {
		int a =20;
		int b =30;
		
		System.out.println(a+b);
	}
	
	public void m2() {
		int a =5;
		int b =6;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
	
		
		Method m = new Method();
		
		m.m2();
		m1();
		
		MethodWithArg.add(120, 180);
	}

}
