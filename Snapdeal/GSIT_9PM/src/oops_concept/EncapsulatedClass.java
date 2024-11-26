package oops_concept;

public class EncapsulatedClass {

	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 18 || age > 60) {	
		System.out.println("The Age should be in between 18 to 60 years");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.length() < 4 || name.length() > 10) {
			throw new RuntimeException("The Name should Accept 4 to 10 Characters!");
		}
	}
	
	
	

}
