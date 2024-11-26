package java_programs;

public class BreakDoWhile {

	public static void main(String[] args) {
		
		int i=0;
		
		do {
			
			System.out.println("i value is: "+i);
			
			if(i==9) {
				break;	
			}
			i++;
		}
       
		while(i<15);
	}

}
