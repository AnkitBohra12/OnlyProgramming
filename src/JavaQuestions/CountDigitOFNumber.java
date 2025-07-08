package JavaQuestions;

public class CountDigitOFNumber {
	
	public static int countDigit(int a) {
		int count = 0;
		
		for(int i=a; i>0; i=i/10) {
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countDigit(25));
	}
}
