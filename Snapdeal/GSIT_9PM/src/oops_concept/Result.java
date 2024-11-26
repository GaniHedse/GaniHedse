package oops_concept;

public class Result {
	
	public void openResult(int rollNum) {
		System.out.println("Result Opened Successfully with Roll Number: "+rollNum);
	}
	
	public void openResult(String sName) {
		System.out.println("Result Opened Successfully with Student Name: "+sName);
	}
	
	public void openResult(String lName, String DOB) {
		System.out.println("Result Opened Successfully with Student last Name and DOB : "+lName+", "+DOB);
	}
	

	public static void main(String[] args) {
		
		Result obj = new Result();
		
		obj.openResult(101);
		obj.openResult(104);
		obj.openResult("Ashish Kumar");
		obj.openResult("Tiwari", "14 Jan");
		
	}

}
