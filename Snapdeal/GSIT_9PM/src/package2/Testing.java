package package2;

public class Testing {

	public static void main(String[] args) {
       
       int[] arr = {30, 40, 20, 18, 42, 50, 45};
       
       for(int i=0; i<arr.length; i++) {
    	   System.out.print(arr[i]+" ");
       }
       
       System.out.println();
       
       //For Each loop
       
       for(int data : arr) {
    	   System.out.print(data+" ");
       }
       
       System.out.println();
       
       String[] arr1  = {"Nivedita", "Lalitha", "Sahil", "Shivam", "Jyothasana"};
       
       for(String data : arr1) {
    	   System.out.print(data+" ");
       }
       
       
       System.out.println();
       
       for(int i= arr1.length-1; i>=0; i--) {
    	   System.out.print(arr1[i]+" ");
       }
       
	}

}
