package java_programs;

public class Student {
	
	int a; int b;

	public Student(int m1, int m2) {
		a =m1;
		b =m2;
	}
	
	public void total() {
		System.out.println(a+b);
	}
	
	public void percentage() {
		System.out.println((a+b)/2);
	}

	public static void main(String[] args) {
		
		Student s1 = new Student(70, 80);
		s1.total(); s1.percentage();
		
		Student s2 = new Student(85, 90);
		s2.total(); s2.percentage();
		
		Student s3 = new Student(98, 90);
		s3.total();  s3.percentage();

	}

}
