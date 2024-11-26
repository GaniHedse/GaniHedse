package java_programs;

public class Method {
	
	//Creating Static method
	
	public static void m1() {
		int a =10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
	}

	//Creating Non-Static method
	
	public void m2() {
		
		int a= 30;
		int b= 40;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		
		m1();
		
		Method m = new Method();
		
		m.m2();
	}

}
