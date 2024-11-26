package oops_concept;

class Jan {
	
	public void roi() {
		System.out.println("8.20%");
	}
}

class Feb extends Jan {
	
	public void roi() {
		System.out.println("8.35%");
	}
}

class March extends Feb {
	public void roi() {
		System.out.println("8.10%");
	}
}

public class CurrentMonth extends March {
	
	public void roi() {
		System.out.println("8.40%");
	}

	public static void main(String[] args) {
		
		CurrentMonth obj = new CurrentMonth();
		obj.roi();
	}

}
