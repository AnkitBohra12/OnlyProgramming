package exception;

public class TryWIthCatchBlock {

	public static void main(String[] args) {
		
		try {
			System.out.println("Calculation Starts");
			String s = null;
			
			try												// Nested try and catch
			{
				int i = 10/0;
				System.out.println(i);
			}
			catch(ArithmeticException  e) {
				System.out.println("This is Arithemtic Excpetion");
			}
			System.out.println(s.length());
		}
		
		catch(NullPointerException e ) {
			System.out.println("This is NullPointer Exception");
		}
		
		catch(Exception e ) {
			System.out.println("This is the parent class");
		}
	}

}
