package java_programs;

public class ContinueWhile {

	public static void main(String[] args) {
		
		int i =1;
		
		while(i<10) {
			
			if(i==7) {
				i++;
			continue;
			}
			System.out.println("i value is: "+i);
			i++;
		}

	}

}
