package java_program;

public class ArithmaticOperator {

	public static void main(String[] args) {
		
		int a =10;
		int b =5;
		int c =2;
		int i =10;
		
		System.out.println(i++ + i++ + i-- + i-- + i-- + a++ + i++ + i--); //10+11+12+11+10+10
		System.out.println(a-- + i-- + c++ + c-- + b++ +i--); //11+9+2+3+5
		System.out.println(i-- + i-- + c-- +i--); //8+7+2
		System.out.println(a+b+c+i); //10+6+1+6
		
		

	}

}
