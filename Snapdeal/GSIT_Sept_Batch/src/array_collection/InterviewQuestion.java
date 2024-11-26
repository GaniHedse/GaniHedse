package array_collection;

public class InterviewQuestion {
	
	public static void m1(int sum) {
		
		int[] arr = {4, 5, 7, 11, 9, 13, 8, 12, 15};
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j] ==sum) {
					System.out.println(arr[i]+", "+arr[j]);
				}
			}
		}	
	}

	public static void main(String[] args) {
		
           m1(25);
	}

}
