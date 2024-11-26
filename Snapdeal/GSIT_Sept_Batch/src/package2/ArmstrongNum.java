package package2;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
	//	153 = 1+125+27 = 153
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int total = num;

		int rem; int sum =0; //123
		
		while(num >0) {
			rem = num % 10; //1
			sum = sum +(rem*rem*rem); //6
			num = num/10; //1
			
		}
		

		if(sum==total) 
		{
			System.out.println("Its Armstrong Number");
		}
		else {
			System.out.println("Its Not Armstrong Number");
		}

	}

}
