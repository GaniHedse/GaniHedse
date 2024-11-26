package package2;

import java_program.Method;
import java_program.NonStaticVar;
import java_program.StaticVariable1;

public class Variables {

	public static void main(String[] args) {
	
		System.out.println(StaticVariable1.s1+StaticVariable1.s2);
		
		NonStaticVar obj = new NonStaticVar();
		
		System.out.println(obj.n1+obj.n2);
		
		Method.m1();
		
		Method m = new Method();
		m.m2();

	}

}
