// create an int array and print the sum of all the numbers

package Arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {1,6,9,2,5};	
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
	}

}
