package java_programs;

public class Button {
	
	int a; int b; String c;
	
	public Button(int height, int width,  String bName) {
		a = height;
		b = width;
		c = bName;
	}
	
	public void buttonCreate() {
		System.out.println("Button is Created with Height, Width and Name as: "+a+" "+b+" "+c);
	}
	
	public void buttonClickable() {
		System.out.println(c+ " Button is Clickable");
	}

	public static void main(String[] args) {
		
       Button OK = new Button(10, 15, "OK");
       OK.buttonCreate(); OK.buttonClickable();
       
       Button Delete = new Button(20, 25, "Delete");
       Delete.buttonCreate(); Delete.buttonClickable();
		
	}

}
