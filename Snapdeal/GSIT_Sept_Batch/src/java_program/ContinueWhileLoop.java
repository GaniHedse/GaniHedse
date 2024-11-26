package java_program;

public class ContinueWhileLoop {

	public static void main(String[] args) {
		
		int i =1;
		
		while(i<=20) {
			
				if(i==7 || i==17) {
					i++;
					continue;
				}
		
		System.out.println("i value is: "+i);
		i++;
		}
	}

}
