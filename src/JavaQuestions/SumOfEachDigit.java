package JavaQuestions;

public class SumOfEachDigit {
	
	public static int sum (int a) {
		int sum = 0;
		
		for(int i=a; i>0; i=i/10) {		
			int a1=i%10;		
			sum+=a1;			
		}
		return sum;		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sum(222));
	}
}
