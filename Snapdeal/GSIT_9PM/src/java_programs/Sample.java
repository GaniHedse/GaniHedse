package java_programs;

public class Sample {
	
	//Creating Constructor
	public Sample() {
		System.out.println("This is Constructor");
	}
	
	//Creating Method
	public void m1() {
		System.out.println("This is Method");
	}
	

	public static void main(String[] args) {
		
    Sample obj = new Sample();
    obj.m1();
    
	}

}
