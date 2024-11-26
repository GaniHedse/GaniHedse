package array_collection;

import java.util.Scanner;

public class SortingOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");

		int size = sc.nextInt();

		System.out.println("Enter the " + size + " Element:");

		int[] arr = new int[size];

		// Loop to Accept the data into Array

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Array is: ");

		// Loop to Print the data of an Arry

		for (int data : arr) {
			System.out.print(data + " ");
		}

		System.out.println();
		System.out.print("Sorted Array is: ");
		
		for(int i =0; i<size; i++) {
			for(int j= i+1; j<size; j++) {
				
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int data : arr) {
			System.out.print(data + " ");
		}

	}

}
