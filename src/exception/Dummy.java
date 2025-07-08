package exception;

public class Dummy {
	
	public static void main(String[] args) {
		
		System.out.println("main method starts");
		
		try
		{  
			int r = 20/5
					; 
		}
		catch(NullPointerException e)
		{
			System.out.println("cannot divide a number by zero");
		}
		
		System.out.println("main method ends");
	}
}
