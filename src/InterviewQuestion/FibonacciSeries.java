package InterviewQuestion;

public class FibonacciSeries {
	
	public static void fibonacci(int a) {
		int first=0, second=1;
		for(int i=0;i<a;i++) {
			System.out.println(first + " ");
			int next = first+ second;
			first = second;
			second = next;
		}
	}
	public static void main(String[] args) {
		int a = 7;
		fibonacci(a);

	}

}
