package java_program;

public class SplitFunction2 {

	public static void main(String[] args) {

		String a = "Manas QA Java Selenium Classes By GSIT";

		String[] arr = a.split(" ");

		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i].contains("a") ){
			System.out.print(arr[i]+" ");
		}
		}
	}

}
