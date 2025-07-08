package JavaQuestions;

public class CalculatePower {
	
	public static int calculatePower(int a, int b) { // 33 // 
		
		int power=1;
		
		while(a>=1) {
			power = power*b;
			a--;
		}
		
		return power;
	}
	
	public static void main(String[] args) {
		System.out.println(calculatePower(3,4));
	}

}
