package JavaQuestions;

public class FactorialOFaNumber {
	
	public static int factorial(int a) {		// 10*9*8 till 1
		int pwr=1;
		
		for(int i=a; i>0; i--) {
			 pwr = pwr*i;
		}
		return pwr;	
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(4));	
	}

}
