package java_programs;

public class NestedIf {

	public static void main(String[] args) {
		
		int a =30;
		int b =25;
		int c =20;
		
		if(a>b && a>c) {
			System.out.println("A is Greater");
		}
		 else if (b>c) {
			System.out.println("B is Greater");
		}
		else {
			System.out.println("C is Greater");
		}

	}

}
