package exception;

public class MethodsOfThrowableClass {

	public static void main(String[] args) {
		
		try {
			System.out.println("calculation starts");
//			String s = null;
//			System.out.println(s.length());
			
			try {
				int i = 10/0;
				System.out.println(i);
			}

//		2)	printStackTrace method
			catch(ArithmeticException  e) {
				System.err.println("Hello");		// indicates red color error message
				e.printStackTrace();			// return type is void that's y we can't print it
			}
		}
		
//		1)  getMessage
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

}
