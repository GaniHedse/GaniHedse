package java_programs;

public class Students {
	
	int a; int b; int c;

	public Students(int m1, int m2) {
		a =m1;
		b =m2;
	}
	
	public Students(int m1, int m2, int m3) {
		a =m1;
		b =m2;
		c =m3;
	}
	
	public void total() {
		System.out.println(a+b);
	}
	
	public void percentage() {
		System.out.println((a+b)/2);
	}
	
	public void total1() {
		System.out.println(a+b+c);
	}
	
	public void percentage1() {
		System.out.println((a+b+c)/3);
	}


	public static void main(String[] args) {
		
		Students s1 = new Students(82, 90);
		s1.total(); s1.percentage();
		
		Students s2 = new Students(89, 90, 100);	
		s2.total1(); s2.percentage1();

	}

}
