package exception;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		try {
			int [] a = {1,2,5};
			System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}	
		finally {
			System.out.println("Progamme Terminated Successfully");
		}
	}
}
