package java_programs;

public class NonStaticVar {
	
	public int n1 =30;
	public int n2 =40;

	public static void main(String[] args) {
		
		NonStaticVar obj = new NonStaticVar();	
		
		System.out.println(obj.n1+obj.n2);
	}

}
