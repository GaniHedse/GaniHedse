package java_programs;

public class SplitMethod {

	public static void main(String[] args) {
		
		String s = "Welcome to Java and Automation Testing xyz Classes By Manas abc"; 
		
		String[]  arr = s.split(" ");
		
		for(int i=0; i<=arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		
		}
		
	}

}
