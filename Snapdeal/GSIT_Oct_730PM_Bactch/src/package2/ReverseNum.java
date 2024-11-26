package package2;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");

		int num = sc.nextInt(); //123
		
		int rem;
		int sum =0;
		
		while(num>0) {
			rem = num % 10;
			sum = sum*10 + rem; //321
			num = num / 10;
		}
		System.out.println("Reverse Number is: "+sum);
	}

}
