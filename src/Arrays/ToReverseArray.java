// 5) WJP to reverse an array

// Two pointer approach

package Arrays;

import java.util.Arrays;

public class ToReverseArray {

	public static void main(String[] args) {
		
		int ar[]= {12,3,2,4,1234,41};	
		int i=0, j = ar.length-1;
		System.out.println(Arrays.toString(ar));
		
		while(i<j) {
			int temp = ar[0];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;		
		}	
		System.out.println(Arrays.toString(ar));
	}
}
