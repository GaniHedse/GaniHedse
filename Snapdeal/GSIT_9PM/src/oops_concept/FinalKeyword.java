package oops_concept;


class Parent1 {
	final void dispaly() {
		System.out.println("Dispaly Method in Parent class");
	}
}

public class FinalKeyword extends Parent1 {

	public static void main(String[] args) {
		
		final int a =20;
		
		System.out.println(a);

	}

}
