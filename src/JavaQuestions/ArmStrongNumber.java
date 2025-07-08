package JavaQuestions;

public class ArmStrongNumber {
	
//	1^3+5^3+3^3=1+125+27=153✅
	
	public static int armStrong(int  a) {
		int count=0,temp,sum=0;
		
//		counted the digit of a number
		for(int i=a; i>0; i=i/10) {
			temp = i%10;
			count++;
		}
		
		System.out.println(count + ": no of digits");
//		fatching every digit and multiple it with count then add 
		
		for(int i=a; i>0; i=i/10) {
			temp=i%10;		// 3
			temp*=count;	// 27 		// wrong
			sum+=temp;		// 27
		}
		
			return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(armStrong(153));
	}

}

