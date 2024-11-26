package java_programs;

public class ContinueWithFor {

	public static void main(String[] args) {
		
		for(int i=1; i<=20; i++) {
			
			if(i==13 || i==17) {
				continue;
			}
			
			System.out.println(i);
		}

	}

}
