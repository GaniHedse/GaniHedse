package java_programs;

public class MethodWithArg {

	//Creating the method with Argument
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void multiply(int m1, int m2) {
		System.out.println(m1*m2);
	}
	
	public static void main(String[] args) {
		
		add(10, 40);
		add(50, 70);
		add(25, 75);
		add(80, 90);
		add(85, 100);
		
		MethodWithArg m = new MethodWithArg();
		m.multiply(500, 600);
		m.multiply(12, 12);

	}

}
