package java_program;

public class BreakWhile {

	public static void main(String[] args) {
		
		int i =10;
		
		while(i<=20) {
			
			if(i==17) {
				break;
			}
			System.out.println("i value is: "+i);
			i++;
		}

	}

}
