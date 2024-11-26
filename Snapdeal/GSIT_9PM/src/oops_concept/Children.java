package oops_concept;

class GrandParent {
	
	public void lands() {
		System.out.println("Lands");
	}
}

class Parents extends GrandParent {
	
	public void gold() {
		System.out.println("Gold");
	}
}

public class Children extends Parents {
	
	public void house() {
		System.out.println("House");
	}

	public static void main(String[] args) {
		
		Children c = new Children();
		c.lands(); c.gold(); c.house();
		
		Parents p = new Parents();
		p.gold(); p.lands(); 
		

	}

}
