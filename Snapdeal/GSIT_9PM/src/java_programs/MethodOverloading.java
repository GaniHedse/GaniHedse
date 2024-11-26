package java_programs;

public class MethodOverloading {
	
	public static void add(int m1, int m2) {
		System.out.println(m1+m2);
	}
	
	
	public static void add(int a1, int a2, int a3) {
		System.out.println(a1+a2+a3);
	}
	
	public static void add(int a1, int a2, int a3, int a4) {
		System.out.println(a1+a2+a3+a4);
	}
	
	

	public static void main(String[] args) {
		
         add(78, 80);
         add(89, 90);
         add(80, 90, 92);
         add(89, 70, 90, 80);
        
	}

}
