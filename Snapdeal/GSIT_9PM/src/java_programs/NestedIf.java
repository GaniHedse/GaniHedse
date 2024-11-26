package java_programs;

public class NestedIf {

	public static void main(String[] args) {
		
		int a =70;
		int b =70;
		int c =70;
		
		if(a>b && a>c) {
			System.out.println("A is Greater");
		}
		
		else if (b>c) {
			System.out.println("B is Greater");
		}
		
		else {
			System.out.println("C is Greater");
		}

		System.out.println("End of the Program...");
	}

}
