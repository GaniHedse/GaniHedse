package java_program;

public class Method {

	//Creating Static Method
	public static void m1() {
		int a =20; int b =30;
		System.out.println(a+b);
	}
	
	//Creating Non-Static Method
	 public void m2() {
		int a =10; int b =15;
		System.out.println(a*b);
	}
	 
	 public void m3() {
			int a =10; int b =15;
			System.out.println(a*b);
		}
	
	
	public static void main(String[] args) {
		
		m1();
		m1();

		Method m = new Method();
		m.m2();
		
	}

}
