package oops_concept;

class GrandParents {
	
	public void lands() {
		System.out.println("Lands");
	}
}

class Parents extends GrandParents {
	
	public void gold() {
		System.out.println("Gold");
	}
}

public class Children extends Parents {
	
	public void shares() {
		System.out.println("Shares");
	}

	public static void main(String[] args) {
		
		Children c = new Children();
		c.shares(); c.gold(); c.lands();
		
		Parents p = new Parents();
		p.lands(); p.gold();

	}

}
