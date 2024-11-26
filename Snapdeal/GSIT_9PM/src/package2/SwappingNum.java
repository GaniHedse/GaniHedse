package package2;

import java.util.Scanner;

public class SwappingNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number:");
		
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println("Before Swapping: a= "+a+" and b= "+b);
		
		a=a+b;  //50
		b=a-b;  //20
		a=a-b;  //30
		
		System.out.println("After Swapping: a= "+a+" and b= "+b);
	}

}
