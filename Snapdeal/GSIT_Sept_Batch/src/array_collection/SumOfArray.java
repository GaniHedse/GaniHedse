package array_collection;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] age = { 30, 12, 44, 55, 32, 78, 60, 39, 70};
		
		int sum = 0;
		
		for(int data: age) {
			sum = sum +data;
		}
		
		System.out.println("Sum of All the age is: "+sum);
		
		int avg = sum/age.length;
		
		System.out.println("Average Age is: "+avg);
	}

}
