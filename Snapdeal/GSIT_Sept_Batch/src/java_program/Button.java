package java_program;

public class Button {
	
	int a; int b; String c;

	public Button(int height, int width, String bName) {
		a = height;
		b = width;
		c = bName;
	}
	
	public void buttonCreate() {
		System.out.println("Button is Created with height, width and name as: "+a+ ", "+b+", "+c);
	}
	
	public void buttonClickable() {
		System.out.println(c+" button is Clickable");
	}

	public static void main(String[] args) {
		
		Button b = new Button(20, 15, "OK");
		
		b.buttonCreate();
		b.buttonClickable();
		
		Button b1 = new Button(25, 10, "Save");
		
		b1.buttonCreate();
		b1.buttonClickable();
	}

}
