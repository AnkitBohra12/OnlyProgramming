// WJP to return the difference of original number and its reverse number
// 112 - 211

package JavaQuestions;

public class Calculate_difference {
	
	public static int reverse(int a) {
		
		int rev=0, temp = a ;
		
		for(int i=a; i!=0; i/=10 ) {
			int digit = i % 10;		// 12%10 = 2	/ 20
			
			rev = rev*10+digit;		// 20+1 = 21					
		}
		return temp-rev	;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse(13));
	}
	

}
