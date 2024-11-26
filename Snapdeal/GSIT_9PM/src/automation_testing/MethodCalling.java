package automation_testing;

public class MethodCalling {

	public static void main(String[] args) throws Exception {
		
		Method m = new Method();
		
		m.launchApp("https://www.facebook.com/");
		m.elementAvailable("email", true);
		m.elementAvailable("pass", true);
		m.elementEnabled("email", true);
		m.elementEnabled("pass", true);
		m.titleContains("Facebook");
		m.urlContains("www");
		m.closeApp();
	}

}
