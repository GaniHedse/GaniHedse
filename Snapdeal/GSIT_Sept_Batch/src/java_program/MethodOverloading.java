package java_program;

public class MethodOverloading {
	
	public  void add(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public final void add(int n1, int n2, int n3) {
		System.out.println(n1+n2+n3);
	}
	
	public  void add(int n1, int n2, int n3, int n4) {
		System.out.println(n1+n2+n3+n4);
	}
	
	public  void add(String fn , String ln) {
		System.out.println(fn+ln);
	}

	public static void main(String[] args) {
		
		

	}

}
