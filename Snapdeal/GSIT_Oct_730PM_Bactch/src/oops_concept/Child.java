package oops_concept;

class Parent {
	
	public void lands() {
		System.out.println("Lands");
	}
}

public class Child extends Parent {

	public void gold() {
		System.out.println("Gold");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.gold();
		c.lands();
		
		Parent p = new Parent();
		p.lands(); 

	}

}
