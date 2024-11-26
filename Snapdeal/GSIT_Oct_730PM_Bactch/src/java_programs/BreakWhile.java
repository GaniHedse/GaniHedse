package java_programs;

public class BreakWhile {

	public static void main(String[] args) {
		
		int i =1;
		
		while(i<10) {

			if(i==6) {
				break;
			}
			
			System.out.println("i value is: "+i);
			i++;
		}

	}

}
