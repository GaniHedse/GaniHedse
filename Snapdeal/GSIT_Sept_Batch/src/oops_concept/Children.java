package oops_concept;

class GrandParents {

	public void lands() {
		System.out.println("Lands");
	}
}

class Parent extends GrandParents {
	
	public void gold() {
		System.out.println("Gold");
	}
}

public class Children extends Parent{
	
	public void shares() {
		System.out.println("Shares");
	}

	public static void main(String[] args) {
		
		Children c = new Children();
		c.shares();
		c.gold();
		c.lands();
		
		Parent p = new Parent();
		p.lands();
		p.gold();
		

	}

}
