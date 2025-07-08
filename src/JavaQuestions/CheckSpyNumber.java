package JavaQuestions;

public class CheckSpyNumber {
	
	public static boolean checkSpyNumber(int a) { // 22 = 2+2 and 2*2 will be same
		
		int sum=0, multiple = 1;
		
		for(int i=a; i>0; i=i/10) {
			int digit = i%10;
			sum+=digit;		//2
			multiple*=digit;
		}
		return sum == multiple;
	}
	
	public static void main(String[] args) {
		System.out.println(checkSpyNumber(22));
		System.out.println(checkSpyNumber(12));
	}

}
