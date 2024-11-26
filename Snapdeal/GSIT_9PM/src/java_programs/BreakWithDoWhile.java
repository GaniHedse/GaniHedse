package java_programs;

public class BreakWithDoWhile {

	public static void main(String[] args) {
		
		int i=1;
		
		do {
			
			if(i==3) {
				break;
			}
			
			System.out.println("i value is: "+i);
			i++;
		}
		
		while(i<=5);

	}

}
