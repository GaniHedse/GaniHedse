package array_collection;

public class SumOfArray {

	public static void main(String[] args) {
		
		 int[] arr = {30, 40, 20, 18, 42, 50, 45};
		 
		 int sum = 0;
		 
		 for(int num : arr) {
			 sum = sum + num;
		 }
		 
		 System.out.println("Sum of Array is: "+sum);
		 
		 int avg = sum/arr.length;
		 
		 System.out.println("Average of the Array is: "+avg);
	}

}
