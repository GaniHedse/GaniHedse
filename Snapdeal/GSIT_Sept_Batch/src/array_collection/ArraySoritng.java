package array_collection;

import java.util.Scanner;

public class ArraySoritng {

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
		System.out.print("Sorted Array is: ");
		
		//Loop to Sort the Array:
		
		for(int i=0; i<size ; i++) {
			for(int j=i+1; j<size; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		//Loop to print Sorted Array:
		
		for(int data: arr) {
			System.out.print(data+" ");
		}
	}

}
