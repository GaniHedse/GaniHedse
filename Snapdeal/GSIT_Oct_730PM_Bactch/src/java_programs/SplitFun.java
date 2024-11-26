package java_programs;

public class SplitFun {

	public static void main(String[] args) {
		
		String s = "Manas QA Java Selenium API Classes xyz Bangalore"; //aidnI erutneccA
		
		String[]  arr =  s.split(" ");
		
		for(int i=0; i<=arr.length-1; i++) {
			
			if(arr[i].startsWith("A") || arr[i].startsWith("M")) {
			System.out.print(arr[i]+" ");
		}
		
		}
	}

}
