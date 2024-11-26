package package2;

import java_programs.Class_2;
import java_programs.Method;
import java_programs.NonStaticVar;
import java_programs.SaticVar;

public class Variable {

	public static void main(String[] args) {
		
		System.out.println(SaticVar.s1+SaticVar.s2);
		
		NonStaticVar manas = new NonStaticVar();
		
		System.out.println(manas.n1 + manas.n2);
		
		Method.m1();
		Method m = new Method();
		m.m2();
		
		Class_2 obj = new Class_2();
		System.out.println(obj.p1);

	}

}
