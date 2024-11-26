package java_programs;

public class MethodOverloading {
	
	public static void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public static void add(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	public static void add(int n1, int n2, int n3, int n4) {
		System.out.println(n1+n2+n3+n4);
	}
	
	public static void add(int n8, double n9) {
		System.out.println(n8+n9);
	}
	
	public static void add(int n8, long n9) {
		System.out.println(n8+n9);
		System.out.println("long");
	}

	public static void main(String[] args) {
		add(20, 40.89);
		add(30, 40, 50);
		add(140, 120);
		add(40, 30, 50, 60);
		add(34, 50l);
	}

}
