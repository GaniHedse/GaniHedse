package oops_concept;

import java_programs.Class_2;

class Father {
	
	public void lands() {
		System.out.println("Lands");
	}
	public void gold() {
		System.out.println("Gold");
	}
}

class Child1 extends Father {
	
	public void house() {
		System.out.println("House");
	}
}
public class Child2 extends Father {
	
	public void share() {
		System.out.println("Share");
	}

	public static void main(String[] args) {
		
		Child2 c2 = new Child2();
		c2.share(); c2.gold(); c2.lands();
		
        Child1 c1 = new Child1();
        c1.lands(); c1.gold(); c1.house(); 
        
	}

}
