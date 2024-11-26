package java_programs;

public class BreakWithForLoop {

	public static void main(String[] args) {
		
		for (int i=2; i<=10; i=i+2) {
			if(i==7 && i==10) {
				break;
			}
			
			System.out.println("i value is: "+i);
		}

	}

}
