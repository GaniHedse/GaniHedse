package array_collection;

import java.util.Scanner;

public class ReadingDataFromConsole {

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
		System.out.print("Reverse Array is: ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		int sum = 0;

		for (int data : arr) {
			sum = sum + data;
		}
        System.out.println();
		System.out.println("Sum of Array is: " + sum);

		int avg = sum / arr.length;

		System.out.println("Average of the Array is: " + avg);
	}

}
