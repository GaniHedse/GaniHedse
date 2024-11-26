package oops_concept;

abstract class FirstRelease {
	
	public void classRoom() {
		System.out.println("Classroom Training is Started...");
	}
	public abstract void online();
	public abstract void corporate();
	
}

abstract class SecondRelease extends FirstRelease {

	@Override
	public void online() {
	System.out.println("Online Training is Started...");
	}
}

public class FinalRelease extends SecondRelease {
	
	@Override
	public void corporate() {
	 System.out.println("Corporate Training is Started...");	
	}
	
	public static void main(String[] args) {

		FinalRelease f = new FinalRelease();
		f.classRoom();
		f.online();
		f.corporate();
		
		//SecondRelease s = new SecondRelease();
		
	}

	

}
