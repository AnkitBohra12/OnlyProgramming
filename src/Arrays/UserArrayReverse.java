// Take the size and input form user and reverse the array

package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UserArrayReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : " );
		int a = sc.nextInt();
		
		int [] arr = new int[a]; 
		System.out.print("Enter the elements of array : ");
		
		for(int i=0; i<a ; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for(int j=arr.length-1 ; j<0; j--) {
			System.out.println(Arrays.toString(arr));
		}
	}

}
