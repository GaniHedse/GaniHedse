package oops_concept;

interface Software {
	
	public void startDate();
	public void endDate();
	public void fee();
	
}

interface Software2 {
	public void subject();
}

class School1 implements Software {

	@Override
	public void startDate() {
		System.out.println("June 14th");	
	}

	@Override
	public void endDate() {
		System.out.println("April 28th");
	}

	@Override
	public void fee() {
		System.out.println("80000");	
	}
	
	public void sports() {
		System.out.println("Football");
	}
	
}


public class School2 implements Software, Software2  { //Multiple Inheritance


	@Override
	public void startDate() {
		System.out.println("July 4th");
	}

	@Override
	public void endDate() {
	System.out.println("May 2nd");
	}

	@Override
	public void fee() {
		System.out.println("50000");
	}
	
	@Override
	public void subject() {
		System.out.println("Science, Arts, and Commerce");
		
	}
	
	public static void main(String[] args) {
		
		Software s1 = new School1();
		s1.startDate();
		s1.endDate();
		s1.fee();
		
		
		Software s2 = new School2();
		s2.startDate();
		s2.endDate();
		s2.fee();
		
		Software2 ss2 = new School2();
		ss2.subject();
		
		School1 ss1 = new School1();
		ss1.sports();
		
	}

	

}
