package package2;

import java.util.Scanner;

public class PalidormNumber {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number");
			
			int num = sc.nextInt();   //123
			
			int temp = num;
			
			int rem;
			int sum = 0;
			
			while(num!=0) {
				
			rem = num%10; 
			sum = sum*10+rem; //321
			num = num/10;
				
			}
			
			if(temp==sum) {
				System.out.println("Its Palindrom Number");
			}
			else {
				System.out.println("Its Not Palindrom Number");
			}

	}

}
