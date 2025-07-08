package Arrays;

import java.util.Arrays;

public class SwiftingAnArray {
	
	public static void rotate(int[]ar , int k) {			// k = rotation
//		k = k % ar.length;									// if the its is multiple of the length then we dont have to rotate // 10 % 5
//		if(k==0)											// for this we have to take returntype as int[]
//		retunr ar;
		
		int temp[]= new int[ar.length];
		while(k>0) {
			for(int i=0; i<ar.length ;i++) {
				int value = (i+1)%ar.length;
				temp[value] = ar[i];
			}
			
			ar=Arrays.copyOf(temp, ar.length);
			System.out.println(Arrays.toString(temp));		// for parameterize remove this and print at the main
			k--;
		}
//		 and here we have to return temp
	}

	public static void main(String[] args) {
		int[] a = {1,6,3,2,9};
		rotate(a, 10);
		
//		System.out.println(Arrays.toString(rotate(a,4)));
	}
}	


