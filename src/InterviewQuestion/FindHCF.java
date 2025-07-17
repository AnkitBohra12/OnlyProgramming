package InterviewQuestion;

public class FindHCF {
	
	 public static int hcf(int a, int b) {
	        if (b == 0)
	            return a;
	        return hcf(b, a % b);
	    }

	    public static void main(String[] args) {
	        int a = 10;
	        int b = 24;

	        System.out.println("HCF of " + a + " and " + b + " is: " + hcf(a, b));
	   }
}
