package package2;

import java_programs.NonStaticVar;
import java_programs.StaticVar;

public class Variable {

	public static void main(String[] args) {
	
		System.out.println(StaticVar.s1+StaticVar.s2);
		
		NonStaticVar obj1 = new NonStaticVar();
		
		System.out.println(obj1.n1+obj1.n2);

	}

}
