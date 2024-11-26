package java_program;

public class BreakDoWhile {

	public static void main(String[] args) {
		
		int i =0;
		
		do {
			System.out.println("i value is: "+i);
			i++;
			
			if(i!=7) {
				break;
			}
			
			
		}
		while(i<=10);
	}

}
