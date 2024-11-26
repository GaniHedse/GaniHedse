package java_programs;

public class BreakWithWhile {

	public static void main(String[] args) {
		
		int i=0;
		
		while(i<=5) {
			
			if(i==3) {
				break;
			}
			System.out.println("i value is: "+i);
			i++;
		}

	}

}
