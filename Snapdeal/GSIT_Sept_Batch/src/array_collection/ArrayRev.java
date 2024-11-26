package array_collection;

public class ArrayRev {

	public static void main(String[] args) {
		
		String[] name =  {"Anusha", "Prabhu", "Deepshikha", "Manas", "Ayan", "Niharika"  };
		
		for(int i=name.length-1; i>=0; i--) {
			System.out.print(name[i]+" ");
		}
		
		System.out.println();
		
		for(String ref : name) {
			System.out.print(ref+" ");
		}
		
		

	}

}
