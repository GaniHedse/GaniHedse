package java_programs;

public class Access {

	//Creating the cariable with diff Access Specifire
	
			public  int a =10;
			protected  int b= 20;
			private  int c= 30;
			int d = 40;				
			
	public static void main(String[] args) {
		
		Access obj = new Access();
		
		System.out.println(obj.a+obj.b+obj.c+obj.d);
	}

}
