package java_program;

public class ContinueDoWhile {

	public static void main(String[] args) {
		
		int i=0;
		
		do {
			i++;
			if(i==3) {
				continue;
			}
			System.out.println("i value is: "+i);
			
		}
		while(i<=5);

	}

}
