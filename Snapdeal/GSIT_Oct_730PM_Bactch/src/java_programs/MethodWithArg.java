package java_programs;

public class MethodWithArg {
	
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void multiply(int n1, float n2) {
		System.out.println(n1*n2);
	}
	
	

	public static void main(String[] args) {
		
		add(50, 60);
		add(120, 140);
		add(75, 25);
		
		MethodWithArg obj = new MethodWithArg();
		
		obj.multiply(30, 50.78f);
		obj.multiply(50, 70.88f);

	}

}
