package package2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 5! = 5*4*3*2*1 = 120
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		int f =1;
		
		for(int i=1 ; i<=num; i++) {
			 f = f*i;
		}
		
		System.out.println("Factorial is: "+f);

	}

}
