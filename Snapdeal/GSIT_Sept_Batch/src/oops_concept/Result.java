package oops_concept;

public class Result {
	
	public void openResult(int rollNum) {
		System.out.println("Result Opened Successfully with Roll Num: "+rollNum);
	}
	
	public void openResult (String sName) {
		System.out.println("Result Opened Successfully with Student name: "+sName);
	}

	public static void main(String[] args) {
		
		Result r = new Result();
		
		r.openResult(102);
		r.openResult(106);
		
		r.openResult("Ashish Kumar");

	}

}
