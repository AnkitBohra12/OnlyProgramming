package InterviewQuestion;

public class PrimeNumber {
	
	public static void prime(int a) {
		if(a<0 || a%2!=0 ) {
		System.out.println(a+ " is a prime");	
		}	
	}

	public static void main(String[] args) {
		prime(6);
		

	}

}
