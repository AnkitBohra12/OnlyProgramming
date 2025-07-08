// WJP to find an average of an array

package Arrays;

public class AverageOfArrays {
	
	public static double average(int arr[]) {
		double sum = 0, j = arr.length;
		for(int i=0; i<arr.length ;i++) {
			sum = sum+arr[i];
		}
		return sum/j;
	}

	public static void main(String[] args) {
		
		int a[] = {10,16,2,4,1};
		System.out.println(average(a));
	}
}
