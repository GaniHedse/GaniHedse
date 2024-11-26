package java_program;

public class Access {
	
	public int n1 = 10;
	protected int n2 = 20;
	private int n3 = 30;
	int n4 = 40;

	public static void main(String[] args) {
		
		Access obj = new Access();
		
		System.out.println(obj.n1+obj.n2+obj.n3+obj.n4);

	}

}
