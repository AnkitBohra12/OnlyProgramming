package exception;

public class NegativeTypeExcpetion extends Exception {
	
	@Override
	public String getMessage() {
		return "Enter the positive number";
	}
}
