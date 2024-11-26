package package2;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
		//4! = 4*3*2*1 =24
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		
		int num = sc.nextInt();
		int f =1;
		
		while(num !=0) {
			
			f = f*num;
			num--;
		}
		
		System.out.println("Factorial is: "+f);
		
	}

}
