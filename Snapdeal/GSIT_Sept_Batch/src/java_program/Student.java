package java_program;

public class Student {
	
	int a; int b;

	public Student(int m1, int m2) {
		a = m1;
		b = m2;
	}
	
	public void total() {
		System.out.println(a+b);
	}
	
	public void percentage() {
		System.out.println((a+b)/2);
	}

	public static void main(String[] args) {
		
		Student  s1 = new Student(80, 90);
		s1.total();  s1.percentage();
		
		Student s2 = new Student(90, 98);
		s2.total();  s2.percentage();

	}

}
