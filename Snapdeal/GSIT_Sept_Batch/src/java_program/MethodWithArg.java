package java_program;

public class MethodWithArg {
	
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void multiply(int n1, int n2) {
		System.out.println(n1*n2);
	}

	public static void main(String[] args) {
		
		add(20, 40);
		add(120, 180);
		add(300, 200);
		
		MethodWithArg m = new MethodWithArg();
		m.multiply(30, 40);
		m.multiply(40, 60);
	}

}
