package java_programs;

public class NonStaticVar {
	
	//Creating Non Static Variable
	
	public int n1 =40;
	public int n2 =60;

	public static void main(String[] args) {
		
		NonStaticVar obj = new NonStaticVar();
		
		System.out.println(obj.n1+obj.n2);
	}

}
