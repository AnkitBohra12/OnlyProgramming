package exception;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		try {
				for(int i=0; i<arr.length ; i++) {
				System.out.println(arr[4]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No index available");
		}
	}
}
