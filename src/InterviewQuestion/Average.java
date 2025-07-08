// 2) write a java programme to find average of n number and print diffreence between each number and average

package InterviewQuestion;

public class Average {
	
	int a,b,c,d;
	
	Average(int a,int b, int c,int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public double average() {

		return (a+b+c+d)/4.0;
		
	}
	
	public void printDifference() {
		System.out.println("Average : " + average());
		System.out.println("Number : " + a + " difference with average : " + (a-average()));
		System.out.println("Number : " + b + " difference with average : " + (b-average()));
		System.out.println("Number : " + c + " difference with average : " + (c-average()));
		System.out.println("Number : " + d + " difference with average : " + (d-average()));
	}
	
	public static void main(String[] args) {
		Average a = new Average(10,20,30,40);
		a.printDifference();
	}
	
	

}
