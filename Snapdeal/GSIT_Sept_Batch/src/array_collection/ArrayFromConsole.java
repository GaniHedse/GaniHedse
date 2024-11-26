package array_collection;

import java.util.Scanner;

public class ArrayFromConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of an Array:");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the "+size+" Element:");
		
		//Loop to accept the data into Array
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array is: ");

		//Loop to Print the Data of an Array
		
		for(int data : arr) {
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.print("Reverse Array is: ");
		
		//Loop to Print the Array in Reverse Order
		
		for(int i=size-1; i>=0; i-- ) {
			System.out.print(arr[i]+" ");
		}
		
		int sum = 0;
		System.out.println();
		for(int data : arr) {
			sum = sum + data;
		}
		
		System.out.println("Sum of Array is: "+sum);
		
		int avg = sum/size;
		
		System.out.println("Average of Array is: "+avg);
	}

}
