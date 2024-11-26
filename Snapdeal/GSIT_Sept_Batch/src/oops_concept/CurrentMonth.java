package oops_concept;

class Jan {
	public void roi() {
		System.out.println("8.1%");
	}
}

class Feb extends Jan {
	public void roi() {
		System.out.println("8.2%");
	}
}

class March extends Feb {
	public void roi() {
		System.out.println("8.04%");
	}
}

public class CurrentMonth extends March {
	
	public void roi() {
		System.out.println("8.4%");
	}

	public static void main(String[] args) {
		
        CurrentMonth obj = new CurrentMonth();
        obj.roi();
        
	}

}
