package java_program;

public class Students {

	int a;
	int b;
	int c;

	public Students(int m1, int m2) {
		a = m1;
		b = m2;
	}

	public Students(int m1, int m2, int m3) {
		a = m1;
		b = m2;
		c = m3;
	}

	public void total() {
		System.out.println(a + b);
	}

	public void percentage() {
		System.out.println((a + b) / 2);
	}

	public void total2() {
		System.out.println(a + b + c);
	}

	public void percentage2() {
		System.out.println((a + b + c) / 3);
	}

	public static void main(String[] args) {

		Students s1 = new Students(90, 80);

		s1.total();
		s1.percentage();

		Students s2 = new Students(70, 90, 80);

		s2.total2();
		s2.percentage2();

	}

}
