package java_programs;

public class BreakForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i<100; i++) {
			
			System.out.println("i value is: "+i);

			if(i==78 || i==97) {
				break;
			}
		}

	}

}
